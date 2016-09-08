package com.database.mongo.document.identifiable;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Meta;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface Identifiable
{
    DocumentID getId();
    void setId(DocumentID id);
}
