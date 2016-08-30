package com.database.mongo.document.universallyIdentifiable;

import com.database.mongo.document.universallyIdentifiable.UUID;

public interface UniversallyIdentifiable
{
    UUID getUuid();
    void setUuid(UUID uuid);
}
