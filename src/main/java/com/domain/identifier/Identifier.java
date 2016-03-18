package com.domain.identifier;

import java.util.Objects;

public abstract class Identifier<T>
{
    public Identifier(T identifier)
    {
        id = identifier;
    }

    public T getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Identifier)) return false;
        Identifier<?> that = (Identifier<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id.toString();
    }

    private T id;
}
