package com.database.mongo.repository;

import com.database.mongo.document.DocumentID;
import com.domain.book.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface MongoBaseRepository<T extends Book> extends MongoRepository<T, DocumentID>
{
}
