package com.database.mongo.repository;

import com.domain.book.Book;
import com.domain.identifier.UUID;
import org.springframework.stereotype.Component;

@Component
public interface UniversallyIdentifiableRepository<T extends Book> extends MongoBaseRepository<T>
{
    T findByUuid(UUID uuid);
}
