package com.domain.book;

import com.domain.identifier.Identifier;

public class BookID extends Identifier<Integer>
{
    public BookID(int id)
    {
        super(new Integer(id));
    }
}
