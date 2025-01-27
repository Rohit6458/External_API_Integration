package com.ExternalAPI.API.Service;

import com.ExternalAPI.API.DTO.WeatherApi;
import org.omg.PortableServer.Current;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class WeatherAPI {

    @Autowired
    private RestTemplate restTemplate;



    private final String ApiToken="ad6e396db2e04523bff31534252701";

    @Value("${API}")
    private String API;

    public void getWeatherApi(){
         String  APIKey=API.replace("API_KEY",ApiToken).replace("City","Mumbai");
         ResponseEntity<WeatherApi> response =restTemplate.exchange(APIKey, HttpMethod.GET,null, WeatherApi.class);
    }

}
