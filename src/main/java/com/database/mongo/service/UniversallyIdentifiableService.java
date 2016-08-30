package com.database.mongo.service;

import com.database.mongo.document.universallyIdentifiable.UniversallyIdentifiableDocument;
import com.database.mongo.repository.UniversallyIdentifiableRepository;
import com.domain.book.Book;
import com.database.mongo.document.universallyIdentifiable.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniversallyIdentifiableService<T extends UniversallyIdentifiableDocument> extends MongoBaseService<T>
{
    public T findByUuid(UUID uuid)
    {
        return repository.findByUuid(uuid);
    }

    @Autowired
    protected UniversallyIdentifiableRepository<T> repository;
}
