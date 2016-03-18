package com.controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MongoDBController
{
    @Autowired
    private MongoDBController(MongoClient client)
    {
        MongoDBController.client = client;
    }

    public static void setMongoClient(MongoClient pclient)
    {
        client = pclient;
    }

    /**
     * @description Returns/creates constants with given name
     * @return MongoDatabase
     */
    public static MongoDatabase getDatabase(String name)
    {
        return client.getDatabase(name);
    }

    /**
     * @description Drops the constants with the matching name
     * @param name of the constants
     * @return boolean value indicating successful constants drop
     */
    public static Boolean dropDatabase(String name)
    {
        client.dropDatabase(name);
        MongoCursor<String> names = client.listDatabaseNames().iterator();

        while(names.hasNext())
        {
            if (names.next().equals(name))
                return false;
        }

        return true;
    }

    /**
     * @description Disconnects the client from the constants
     */
    public static void disconnect()
    {
        client.close();
    }

    //////////////////////////////////////////
    // Private fields
    //////////////////////////////////////////

    private static MongoClient client;
}