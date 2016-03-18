package com.domain.book;

import com.mongo.mapper.ObjectMapper;
import org.bson.Document;

public class BookMapper implements ObjectMapper<Book>
{
    @Override
    public Book map(Document mongoDocument)
    {
        // TODO finish off
        Book book = new Book();
        book.setID(new BookID(mongoDocument.getLong("_id").intValue()));

        return null;
    }
}
