package com.ExternalAPI.API.Controller;

import com.ExternalAPI.API.Service.WeatherAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiCalling {
    @Autowired
    private WeatherAPI weatherAPI;

    @GetMapping("/London")
    public void getData(){
        weatherAPI.getWeatherApi();
    }
}
