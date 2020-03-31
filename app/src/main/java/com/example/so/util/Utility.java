package com.example.so.util;

import android.text.TextUtils;
import android.util.Log;

import com.example.so.App;
import com.example.so.App1;
import com.example.so.db.City;
import com.example.so.db.County;
import com.example.so.db.Province;
import com.example.so.gson.Weather;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class Utility {
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try {
                Gson gson=new Gson();
                List<App> appList=gson.fromJson(response,new TypeToken<List<App>>(){}.getType());
                for(App app:appList){
                    Province province=new Province();
                    province.setProvinceCode(app.getId());
                    province.setProvinceName(app.getName());
                    province.save();
                }
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCityResponse(String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            try {
                Gson gson=new Gson();
                List<App> appList=gson.fromJson(response,new TypeToken<List<App>>(){}.getType());
                for(App app:appList){
                    City city=new City();
                    city.setCityName(app.getName());
                    city.setCityCode(app.getId());
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCountyResponse(String response,int cityId){
        if(!TextUtils.isEmpty(response)){
            try {
                Gson gson=new Gson();
                List<App1> app1List=gson.fromJson(response,new TypeToken<List<App1>>(){}.getType());
                for(App1 app1:app1List){
                    County county=new County();
                    county.setCityId(cityId);
                    county.setCountyName(app1.getName());
                    county.setWeatherId(app1.getWeatherId());
                    Log.d("MainActivity", "onResponse: "+app1.getWeatherId());
                    county.save();
                }
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    public static Weather handleWeatherResponse(String response){
        try {
            Gson gson=new Gson();
            /*JSONObject jsonObject=new JSONObject(response);
            JSONArray jsonArray=jsonObject.getJSONArray("HeWeather6");
            String weatherContent=jsonArray.getJSONObject(0).toString();
            if(weatherContent!=null){
                System.out.println("有内容");
            }*/
            Weather weather=gson.fromJson(response,Weather.class);
            if(weather!=null){
                System.out.println("weather也没问题");
            }
            return weather;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
