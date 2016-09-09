package com.database.mongo.document.universallyIdentifiable;

import com.database.mongo.document.identifiable.Document;
import org.springframework.data.mongodb.core.mapping.Field;

public abstract class UniversallyIdentifiableDocument extends Document implements UniversallyIdentifiable
{
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Field
    private String uuid;
}
