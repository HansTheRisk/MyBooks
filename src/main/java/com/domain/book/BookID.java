package com.domain.book;

import com.domain.identifier.Identifier;

public class BookID extends Identifier<Long>
{
    public BookID(long id)
    {
        super(new Long(id));
    }
}
