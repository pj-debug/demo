package com.example.so;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.so.gson.Weather;
import com.example.so.util.HttpUtil;
import com.example.so.util.Utility;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class WeatherActivity extends AppCompatActivity {
    private ScrollView weatherLayout;
    private TextView titleCity;
    private TextView titleUpdateTime;
    private TextView degreeText;
    private TextView weatherInfoText;
    private LinearLayout forecastLayout;
    private LinearLayout hourLayout;
    private LinearLayout nowLayout;
    private TextView comfortText;
    private TextView carWashText;
    private TextView sportText;
    private Button navButton;
    private Button searchButton;
    public SwipeRefreshLayout swipeRefreshLayout;
    public DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        swipeRefreshLayout=findViewById(R.id.swipe_refresh);
        weatherLayout=findViewById(R.id.weather_layout);
        titleCity=findViewById(R.id.title_city);
        titleUpdateTime=findViewById(R.id.title_update_time);
        degreeText=findViewById(R.id.degree_text);
        weatherInfoText=findViewById(R.id.weather_info_text);
        forecastLayout=findViewById(R.id.forecast_layout);
        hourLayout=findViewById(R.id.hour_layout);
        nowLayout=findViewById(R.id.now_info_layout);
        comfortText=findViewById(R.id.comfort_text);
        carWashText=findViewById(R.id.car_wash_text);
        sportText=findViewById(R.id.sport_text);
        navButton=findViewById(R.id.nav_button);
        searchButton=findViewById(R.id.search_button);
        drawerLayout=findViewById(R.id.draw_layout);
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary);
        weatherLayout.setVisibility(View.INVISIBLE);
        requestWeather("auto_ip");
        Intent intent=new Intent(this,BroadcastService.class);
        startService(intent);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                requestWeather(titleCity.getText().toString());
            }
        });
        navButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void requestWeather(final String weatherId){
        Log.d("WeatherActivity", "requestWeather: "+weatherId);
        String weatherUrl="https://free-api.heweather.com/s6/weather?location="+weatherId+"&key=dab018af040840f68d3edc03e0b892f2";
        HttpUtil.sendOkHttpRequest(weatherUrl, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("aaa", "run: ");
                        Toast.makeText(WeatherActivity.this,"获取天气失败",Toast.LENGTH_SHORT).show();
                        swipeRefreshLayout.setRefreshing(false);
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText=response.body().string();
                if(responseText!=null){
                    Log.d("hah", "onResponse: ");
                }
                final Weather weather=Utility.handleWeatherResponse(responseText);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if(weather!=null&&"ok".equals(weather.getHeWeather6().get(0).getStatus())){
                            //Intent intent=new Intent(this,BroadcastService.class);
                            showWeatherInfo(weather);
                            //startService(intent);
                        }else{
                            //Log.d("WeatherActivity", "run: 1");
                            Toast.makeText(WeatherActivity.this,"获取天气失败",Toast.LENGTH_SHORT).show();
                        }
                        swipeRefreshLayout.setRefreshing(false);
                    }
                });
            }
        });
    }
    public void showWeatherInfo(Weather weather){
        String cityName=weather.getHeWeather6().get(0).getBasic().getLocation();
        String updateTime=weather.getHeWeather6().get(0).getUpdate().getLoc();
        String degree=weather.getHeWeather6().get(0).getNow().getTmp()+"℃";
        String weatherInfo=weather.getHeWeather6().get(0).getNow().getCond_txt();
        titleCity.setText(cityName);
        titleUpdateTime.setText(updateTime);
        degreeText.setText(degree);
        weatherInfoText.setText(weatherInfo);
        forecastLayout.removeAllViews();
        nowLayout.removeAllViews();
        hourLayout.removeAllViews();
        for(int j=0;j<8;j++){
            View view=LayoutInflater.from(this).inflate(R.layout.hour_item,hourLayout,false);
            TextView hourTime=view.findViewById(R.id.hour_time);
            TextView hourTxt=view.findViewById(R.id.hour_txt);
            TextView hourTmp=view.findViewById(R.id.hour_tmp);
            hourTime.setText(weather.getHeWeather6().get(0).getHourly().get(j).getTime().substring(11));//只截取时间
            hourTxt.setText(weather.getHeWeather6().get(0).getHourly().get(j).getCond_txt());
            hourTmp.setText(weather.getHeWeather6().get(0).getHourly().get(j).getTmp());
            hourLayout.addView(view);
        }
        for(int i=0;i<7;i++){
            View view=LayoutInflater.from(this).inflate(R.layout.forecast_item,forecastLayout,false);
            String dateText1=weather.getHeWeather6().get(0).getDaily_forecast().get(i).getDate();
            String infoText1=weather.getHeWeather6().get(0).getDaily_forecast().get(i).getCond_code_d();
            String maxText1=weather.getHeWeather6().get(0).getDaily_forecast().get(i).getTmp_max();
            String minText1=weather.getHeWeather6().get(0).getDaily_forecast().get(i).getTmp_min();
            TextView dateText=(TextView) view.findViewById(R.id.date_text);
            //TextView infoText=(TextView) view.findViewById(R.id.info_text);
            ImageView infoText=(ImageView)view.findViewById(R.id.info_text);
            TextView maxText=(TextView)  view.findViewById(R.id.max_text);
            TextView minText=(TextView)  view.findViewById(R.id.min_text);
            dateText.setText(dateText1);
           // infoText.setText(infoText1);
            Glide.with(this).load("https://cdn.heweather.com/cond_icon/"+infoText1+".png").into(infoText);
            maxText.setText(maxText1);
            minText.setText(minText1);
            forecastLayout.addView(view);
        }
        for(int k=0;k<5;k++){
            View view=LayoutInflater.from(this).inflate(R.layout.now_info_item,nowLayout,false);
            TextView text1=view.findViewById(R.id.text1);
            TextView text2=view.findViewById(R.id.text2);
            TextView text3=view.findViewById(R.id.text3);
            TextView text4=view.findViewById(R.id.text4);
            switch (k){
                case 0:{
                    text1.setText("日出");
                    text2.setText(weather.getHeWeather6().get(0).getDaily_forecast().get(0).getSr());
                    text3.setText("日落");
                    text4.setText(weather.getHeWeather6().get(0).getDaily_forecast().get(0).getSs());
                    break;
                }
                case 1: {
                    text1.setText("风向");
                    text2.setText(weather.getHeWeather6().get(0).getNow().getWind_dir());
                    text3.setText("风力");
                    text4.setText(weather.getHeWeather6().get(0).getNow().getWind_sc());
                    break;
                }
                case 2:{
                    text1.setText("湿度");
                    text2.setText(weather.getHeWeather6().get(0).getNow().getHum()+"%");
                    text3.setText("降水概率");
                    text4.setText(weather.getHeWeather6().get(0).getDaily_forecast().get(0).getPop()+"%");
                    break;
                }
                case 3:{
                    text1.setText("大气压强");
                    text2.setText(weather.getHeWeather6().get(0).getNow().getPres()+"百帕");
                    text3.setText("能见度");
                    text4.setText(weather.getHeWeather6().get(0).getNow().getVis()+"公里");
                    break;
                }
                case 4:{
                    text1.setText("降水量");
                    text2.setText(weather.getHeWeather6().get(0).getNow().getPcpn());
                    text3.setText("紫外线强度");
                    text4.setText(weather.getHeWeather6().get(0).getDaily_forecast().get(0).getUv_index());
                    break;
                }
                default:
                    break;
            }
            nowLayout.addView(view);
        }
        String comfort="舒适度："+weather.getHeWeather6().get(0).getLifestyle().get(0).getTxt();
        String sport="运动指数："+weather.getHeWeather6().get(0).getLifestyle().get(3).getTxt();
        String carWash="洗车指数："+weather.getHeWeather6().get(0).getLifestyle().get(6).getTxt();
        comfortText.setText(comfort);
        sportText.setText(sport);
        carWashText.setText(carWash);
        weatherLayout.setVisibility(View.VISIBLE);
    }
}
