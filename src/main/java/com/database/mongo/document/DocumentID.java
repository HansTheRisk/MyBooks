package com.database.mongo.document;

import com.database.identifier.Identifier;

public class DocumentID extends Identifier<Long>
{
    public DocumentID(long id)
    {
        super(new Long(id));
    }
}
