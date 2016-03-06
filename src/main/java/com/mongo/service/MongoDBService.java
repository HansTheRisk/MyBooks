package com.mongo.service;

import com.mongo.repository.MongoDBRepository;

public abstract class MongoDBService<T extends MongoDBRepository>
{
    /**
     * @description Constructor for the class
     * @param repository object
     */
    public MongoDBService(T repository)
    {
        this.repository = repository;
    }

    /**
     * @description Returns the MongoDatabase instance
     * @return {@link MongoDBRepository}
     */
    public T getRepository()
    {
        return repository;
    }

    //////////////////////////////////////////
    // Private fields
    //////////////////////////////////////////

    protected  T repository;
}
