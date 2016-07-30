package com.database.mongo.repository;

import com.domain.identifier.UUID;
import com.domain.identifier.UniversallyIdentifiable;

public interface UniversallyIdentifiableRepository<T extends UniversallyIdentifiable> extends MongoBaseRepository<T>
{
    T findByUuid(UUID uuid);
}
