package com.database.mongo.service;

import com.database.mongo.document.universallyIdentifiable.UUID;
import com.database.mongo.document.universallyIdentifiable.UniversallyIdentifiableDocument;
import com.database.mongo.repository.MongoUniversallyIdentifiableRepository;

public class MongoUniversallyIdentifiableService<T extends UniversallyIdentifiableDocument> extends MongoBaseService<T>
{
    public UniversallyIdentifiableDocument findByUUID(UUID uuid)
    {
        return ((MongoUniversallyIdentifiableRepository)repository).findByUUID(uuid);
    }

    @Override
    public T save(T object) {
        object.setUuid(new UUID(java.util.UUID.randomUUID().toString()));
        return super.save(object);
    }

}