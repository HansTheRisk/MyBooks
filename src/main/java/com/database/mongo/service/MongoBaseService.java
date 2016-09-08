package com.database.mongo.service;

import com.database.mongo.document.identifiable.Document;
import com.database.mongo.document.identifiable.DocumentID;
import com.database.mongo.repository.MongoBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;

public class MongoBaseService<T extends Document>
{
    public T save(T object) {
        object.setId(new DocumentID(repository.count() + 1));
        return repository.save(object);
    }

    @Autowired
    protected MongoBaseRepository<T> repository;
}
