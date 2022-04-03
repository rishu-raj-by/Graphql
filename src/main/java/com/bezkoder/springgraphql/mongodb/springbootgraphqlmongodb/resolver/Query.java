package com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.model.Author;
import com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.model.Tutorial;
import com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.repository.AuthorRepository;
import com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.repository.TutorialRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
@Component
public class Query implements GraphQLQueryResolver {
    private AuthorRepository authorRepository;
    private TutorialRepository tutorialRepository;
    @Autowired
    public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
        this.authorRepository = authorRepository;
        this.tutorialRepository = tutorialRepository;
    }
    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
    public Iterable<Tutorial> findAllTutorials() {
        return tutorialRepository.findAll();
    }
    public long countAuthors() {
        return authorRepository.count();
    }
    public long countTutorials() {
        return tutorialRepository.count();
    }
}