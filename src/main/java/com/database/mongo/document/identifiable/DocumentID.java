package com.database.mongo.document.identifiable;

import com.database.identifier.Identifier;

public class DocumentID extends Identifier<Long>
{
    public DocumentID(long id)
    {
        super(new Long(id));
    }
}
