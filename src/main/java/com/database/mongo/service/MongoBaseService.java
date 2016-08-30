package com.database.mongo.service;

import com.database.mongo.repository.MongoBaseRepository;
import com.domain.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MongoBaseService<T extends Object>
{
    public T save(T object) {
        return repository.save(object);
    }

    @Autowired
    protected MongoBaseRepository<T> repository;
}
