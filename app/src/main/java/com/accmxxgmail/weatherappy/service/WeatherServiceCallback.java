package com.accmxxgmail.weatherappy.service;

import com.accmxxgmail.weatherappy.data.Channel;

public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
