package com.database.mongo.document.universallyIdentifiable;

import com.database.mongo.document.identifiable.Identifiable;

public interface UniversallyIdentifiable extends Identifiable
{
    String getUuid();
    void setUuid(String uuid);
}
