package com.domain.user;

import com.domain.identifier.Identifier;

public class UserID extends Identifier<Integer>
{
    public UserID(int id)
    {
        super(new Integer(id));
    }
}
