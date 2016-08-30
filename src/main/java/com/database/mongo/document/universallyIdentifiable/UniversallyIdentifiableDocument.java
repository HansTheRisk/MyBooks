package com.database.mongo.document.universallyIdentifiable;

import com.database.mongo.document.identifiable.Document;
import org.springframework.data.mongodb.core.mapping.Field;

public class UniversallyIdentifiableDocument extends Document implements UniversallyIdentifiable
{
    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Field
    private UUID uuid;
}
