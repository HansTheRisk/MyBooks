package com.repository.book;

import com.constants.database.Database;
import com.constants.table.Table;
import com.controller.MongoDBController;
import com.domain.book.Book;
import com.domain.book.BookID;
import com.mongo.repository.MongoDBRepository;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class BookRepository extends MongoDBRepository
{
    public BookRepository()
    {
        super(MongoDBController.getDatabase(Database.DEFAULT.toString()));
    }

    public void createBook(Book book)
    {
        MongoCollection<Document> collection = database.getCollection(Table.BOOKS.toString());
        collection.insertOne(
                new Document().append("_id", collection.count() + 1)
                        .append("title", book.getTitle())
                        .append("author", book.getAuthor()));
    }

    public Book getBook(BookID id)
    {
        Document doc = database.getCollection(Table.BOOKS.toString()).find(new Document("_id", id)).iterator().next();
        return null;
    }

    public Collection<Book> getBooks()
    {
        List<Document> documents = new ArrayList<>();
        FindIterable<Document> doc = database.getCollection(Table.BOOKS.toString()).find();
        doc.iterator().forEachRemaining(documents::add);
        return null;
    }

}
