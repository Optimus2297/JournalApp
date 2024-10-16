package com.bhaskar.JournalApp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "config_app_journal")
@Data
@NoArgsConstructor
public class ConfigAppJournalEntity {

    private String key;
    private String value;
}
