package com.database.mongo.document.identifiable;

import org.springframework.data.mongodb.core.mapping.Field;

public class Document implements Identifiable
{
    public DocumentID getId() {
        return id;
    }

    public void setId(DocumentID id) {
        this.id = id;
    }

    @Field
    private DocumentID id;
}