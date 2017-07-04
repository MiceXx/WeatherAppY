package com.accmxxgmail.weatherappy.data;

import org.json.JSONObject;

/**
 * Created by Michael on 03-Jul-2017.
 */

public class Units implements JSONPopulator {
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");
    }
}