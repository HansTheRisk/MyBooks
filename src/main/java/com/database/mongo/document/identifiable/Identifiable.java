package com.database.mongo.document.identifiable;

public interface Identifiable
{
    DocumentID getId();
    void setId(DocumentID uuid);
}
