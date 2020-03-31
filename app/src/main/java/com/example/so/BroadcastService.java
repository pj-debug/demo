package com.example.so;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.IBinder;
import android.os.SystemClock;

import androidx.core.app.NotificationCompat;

import com.example.so.gson.Weather;
import com.example.so.util.HttpUtil;
import com.example.so.util.Utility;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class BroadcastService extends Service {
    public BroadcastService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Intent intent1=new Intent(this,WeatherActivity.class);
        PendingIntent pi=PendingIntent.getActivity(this,0,intent1,0);//点击进入应用
        upDate(pi);
        AlarmManager alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);
        int tenMinutes=5*60*1000;
        long triggerTime= SystemClock.elapsedRealtime()+tenMinutes;
        Intent intent2=new Intent(this,BroadcastService.class);
        PendingIntent pi1=PendingIntent.getService(this,0,intent2,0);
        alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,triggerTime,pi1);
        return super.onStartCommand(intent, flags, startId);
    }
    private void upDate(final PendingIntent pi){
        String address="https://free-api.heweather.com/s6/weather?location=auto_ip&key=dab018af040840f68d3edc03e0b892f2";
        HttpUtil.sendOkHttpRequest(address, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText=response.body().string();
                final Weather weather=Utility.handleWeatherResponse(responseText);
                final String info=weather.getHeWeather6().get(0).getNow().getCond_txt()+"    "+weather.getHeWeather6().get(0).getNow().getTmp()+"℃";
                Notification notification=new NotificationCompat.Builder(getApplicationContext(),"default")
                        .setContentTitle(weather.getHeWeather6().get(0).getBasic().getLocation())
                        .setContentText(info)
                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
                        .setContentIntent(pi)
                        .build();
                startForeground(1,notification);
            }
        });
    }
}
