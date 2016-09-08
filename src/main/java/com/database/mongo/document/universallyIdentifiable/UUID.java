package com.database.mongo.document.universallyIdentifiable;

import com.database.identifier.Identifier;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class UUID //extends Identifier<String>
{
    public UUID (String uuid)
    {
        //super(uuid);
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Field
    private String uuid;
}
