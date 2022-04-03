package com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.model.Author;
public interface AuthorRepository extends MongoRepository<Author, String> {
}