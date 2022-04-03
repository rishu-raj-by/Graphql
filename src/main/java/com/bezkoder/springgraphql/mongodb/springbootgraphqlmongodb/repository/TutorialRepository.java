package com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.model.Tutorial;
public interface TutorialRepository extends MongoRepository<Tutorial, String> {
}