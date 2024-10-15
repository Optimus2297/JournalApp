package com.bhaskar.JournalApp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

//    public <T> T get(String city){
//       try{
//           Object o = redisTemplate.opsForValue().get(city);
//           ObjectMapper mapper = new ObjectMapper();
//           return mapper.readValue(o.toString(),entityClass);
//       }catch(Exception e){
//           log.error("Error occurred :",e);
//           return null;
//       }
//    }

//    public void set(String key, Object o, Long ttl) {
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            String jsonValue = objectMapper.writeValueAsString(o);
//            redisTemplate.opsForValue().set(key, jsonValue, ttl, TimeUnit.SECONDS);
//        } catch (Exception e) {
//            log.error("Exception ", e);
//        }
//    }

    public String get(String city){
    try{
            Object o = redisTemplate.opsForValue().get(city);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(o);
        }catch(Exception e){
            log.error("Error occurred :",e);
            return null;
        }
    }

    public void set(String city, String value, long ttl){
    try{
        redisTemplate.opsForValue().set(city, String.valueOf(value), ttl);
    } catch (Exception e) {
        log.error("Exception ", e);
    }
    }
}
