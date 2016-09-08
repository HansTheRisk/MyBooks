package com.database.mongo.repository;

import com.database.mongo.document.universallyIdentifiable.UUID;
import com.database.mongo.document.universallyIdentifiable.UniversallyIdentifiableDocument;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MongoUniversallyIdentifiableRepository<T extends UniversallyIdentifiableDocument> extends MongoBaseRepository<T>
{
    public T findByUUID(UUID uuid);
}
