package com.example.so;

import com.google.gson.annotations.SerializedName;

public class App1 {
    private int id;
    private String name;
    @SerializedName("weather_id")
    private String weatherId;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
