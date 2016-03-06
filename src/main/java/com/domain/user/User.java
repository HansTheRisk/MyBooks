package com.domain.user;

public class User
{
    public User(String name)
    {
        this.name = name;
    }

    public User(UserID id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public UserID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setID(UserID id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return id + " " + name;
    }

    //////////////////////////////////////////
    // Private fields
    //////////////////////////////////////////

    private UserID id;
    private String name;
}
