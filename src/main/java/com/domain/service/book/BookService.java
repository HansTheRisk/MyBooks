package com.domain.service.book;

import com.domain.book.Book;
import com.database.mongo.service.MongoBaseService;
import com.domain.identifier.UUID;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;

import static com.mongodb.assertions.Assertions.notNull;

@Component
@Service
public class BookService extends MongoBaseService<Book>
{
    public Collection<Book> getBooks()
    {
        return repository.findAll();
    }

    public Book getBook(UUID id)
    {
        notNull("Book id", id);
        return repository.findOne(id);
    }
//
//    public Iterable<Book> getBooks(Iterable<UUID> ids)
//    {
//        notNull("Book ids", ids);
//        return repository.findAll(ids);
//    }
//
//    public Book insertBook(Book book)
//    {
//        notNull("Book", book);
//        return repository.insert(book);
//    }
}
