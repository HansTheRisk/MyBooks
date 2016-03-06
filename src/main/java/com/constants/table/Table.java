package com.constants.table;

public enum Table
{
    USERS("users"),
    BOOKS("books"),
    JOIN("bookshelf");

    Table(String name)
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
