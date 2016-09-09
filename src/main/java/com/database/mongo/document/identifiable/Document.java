package com.database.mongo.document.identifiable;

import org.springframework.data.mongodb.core.mapping.Field;

@org.springframework.data.mongodb.core.mapping.Document
public abstract class Document implements Identifiable
{
    public DocumentID getId() {
        return id;
    }

    public void setId(DocumentID id) {
        this.id = id;
    }

    public abstract String toString();

    @Field
    private DocumentID id;
}
