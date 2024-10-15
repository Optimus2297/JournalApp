package com.bhaskar.JournalApp.cache;

import com.bhaskar.JournalApp.entity.ConfigAppJournalEntity;
import com.bhaskar.JournalApp.repository.ConfigAppJournalRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AppCache {

    public enum keys{
        WEATHER_API;
    }

    @Autowired
    private ConfigAppJournalRepository configAppJournalRepository;

    public Map<String, String> appCache;

    @PostConstruct
    public void init(){
        appCache = new HashMap<>();
        List<ConfigAppJournalEntity> all = configAppJournalRepository.findAll();
        for(ConfigAppJournalEntity c: all){
            appCache.put(c.getKey(),c.getValue());
        }
    }
}
