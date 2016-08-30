package com.database.mongo.service;

import com.database.mongo.repository.UniversallyIdentifiableRepository;
import com.domain.book.Book;
import com.domain.identifier.UUID;
import com.domain.identifier.UniversallyIdentifiable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UniversallyIdentifiableService<T extends Book> extends MongoBaseService<T>
{
    public T findByUuid(UUID uuid)
    {
        return repository.findByUuid(uuid);
    }

    @Autowired
    protected UniversallyIdentifiableRepository<T> repository;
}
