package com.database.identifier;

import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Objects;

public abstract class Identifier<T> implements Serializable
{
    public Identifier(T identifier)
    {
        id = identifier;
    }

    public T getId()
    {
        return id;
    }

    public void setId(T id)
    {
        this.id = id;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Identifier)) return false;
        Identifier<?> that = (Identifier<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

    @Override
    public String toString()
    {
        return id.toString();
    }

    @Field
    private T id;
}
