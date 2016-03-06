package com.mongo.repository;

import com.mongodb.client.MongoDatabase;

public abstract class MongoDBRepository
{
    /**
     * @description Constructor for the class
     * @param database object
     */
    public MongoDBRepository(MongoDatabase database)
    {
        this.database = database;
    }

    /**
     * @description Returns the MongoDatabase instance
     * @return {@link MongoDatabase}
     */
    public MongoDatabase getDatabase()
    {
        return database;
    }

    //////////////////////////////////////////
    // Private fields
    //////////////////////////////////////////

    protected MongoDatabase database;
}
