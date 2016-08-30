package com.database.mongo.document.universallyIdentifiable;

import com.database.identifier.Identifier;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UUID extends Identifier<String>
{
    public UUID (String uuid)
    {
        super(uuid);
    }
}
