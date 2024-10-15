package com.bhaskar.JournalApp.repository;

import com.bhaskar.JournalApp.entity.ConfigAppJournalEntity;
import com.bhaskar.JournalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigAppJournalRepository extends MongoRepository<ConfigAppJournalEntity, ObjectId> {
}
