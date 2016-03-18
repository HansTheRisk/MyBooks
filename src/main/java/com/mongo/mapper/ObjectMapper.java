package com.mongo.mapper;

import org.bson.Document;

public interface ObjectMapper<T>
{
    T map(Document mongoDocument);
}
