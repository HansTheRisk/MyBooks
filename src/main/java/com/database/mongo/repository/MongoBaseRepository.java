package com.database.mongo.repository;

import com.database.mongo.document.DocumentID;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoBaseRepository<T> extends MongoRepository<T, DocumentID>
{
}
