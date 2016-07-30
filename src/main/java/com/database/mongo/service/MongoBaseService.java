package com.database.mongo.service;

import com.database.mongo.repository.MongoBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class MongoBaseService<T>
{
    public T save(T object) {
        return repository.save(object);
    }

    @Autowired
    protected MongoBaseRepository<T> repository;
}
