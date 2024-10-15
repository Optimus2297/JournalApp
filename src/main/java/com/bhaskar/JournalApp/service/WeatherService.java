package com.bhaskar.JournalApp.service;

import com.bhaskar.JournalApp.api.response.WeatherResponse;
import com.bhaskar.JournalApp.cache.AppCache;
import com.bhaskar.JournalApp.constants.Placeholders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppCache appCache;

    @Autowired
    private RedisService redisService;

    public String getWeather(String city){
        String weatherResponse = redisService.get(city);
        if(weatherResponse != null && !weatherResponse.equals("null")){
            return "20";
        }else{
            String finalApi =  appCache.appCache.get(AppCache.keys.WEATHER_API.toString()).replace(Placeholders.CITY, city).replace(Placeholders.API_KEY, apiKey);
//        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalApi, HttpMethod.GET, null, WeatherResponse.class);
//        WeatherResponse body = response.getBody();
            redisService.set(city, "20", 300L);
            return "20";
        }

    }
}
