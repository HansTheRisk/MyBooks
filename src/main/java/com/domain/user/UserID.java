package com.domain.user;

import com.database.identifier.Identifier;

public class UserID extends Identifier<Integer>
{
    public UserID(int id)
    {
        super(new Integer(id));
    }
}
