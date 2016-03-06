package com.constants.database;

public enum Database
{
    DEFAULT("myBooks");

    Database(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }

    private final String name;
}
