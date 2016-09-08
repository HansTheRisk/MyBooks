package com.database.mongo.document.universallyIdentifiable;

import com.database.mongo.document.identifiable.Identifiable;
import com.database.mongo.document.universallyIdentifiable.UUID;

public interface UniversallyIdentifiable extends Identifiable
{
    UUID getUuid();
    void setUuid(UUID uuid);
}
