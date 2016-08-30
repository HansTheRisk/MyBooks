package com.database.mongo.repository;

import com.database.mongo.document.universallyIdentifiable.UniversallyIdentifiableDocument;
import com.domain.book.Book;
import com.database.mongo.document.universallyIdentifiable.UUID;
import org.springframework.stereotype.Component;

@Component
public interface UniversallyIdentifiableRepository<T extends UniversallyIdentifiableDocument> extends MongoBaseRepository<T>
{
    T findByUuid(UUID uuid);
}
