package com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.model.Author;
import com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.model.Tutorial;
import com.bezkoder.springgraphql.mongodb.springbootgraphqlmongodb.repository.AuthorRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;
@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {
    @Autowired
    private AuthorRepository authorRepository;
    public TutorialResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    public Author getAuthor(Tutorial tutorial) {
        return authorRepository.findById(tutorial.getAuthorId()).orElseThrow(null);
    }
}