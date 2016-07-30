package com.database.mongo.service;

import com.database.mongo.repository.UniversallyIdentifiableRepository;
import com.domain.identifier.UUID;
import com.domain.identifier.UniversallyIdentifiable;
import org.springframework.beans.factory.annotation.Autowired;

public class UniversallyIdentifiableService<T extends UniversallyIdentifiable> extends MongoBaseService<T>
{
    public T findByUuid(UUID uuid)
    {
        return repository.findByUuid(uuid);
    }

    @Autowired
    protected UniversallyIdentifiableRepository<T> repository;
}
