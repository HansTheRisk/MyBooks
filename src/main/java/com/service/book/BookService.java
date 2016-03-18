package com.service.book;

import com.domain.book.Book;
import com.domain.book.BookID;
import com.repository.book.BookRepository;
import com.mongo.service.MongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookService extends MongoDBService<BookRepository>
{
    /**
     * @description Constructor for the class
     * @param repository object
     */
    @Autowired
    public BookService(BookRepository repository)
    {
        super(repository);
    }

    public void createBook(Book book)
    {
        repository.createBook(book);
    }

    public void getBook(BookID id)
    {
        repository.getBook(id);
    }

    public Collection<Book> getBooks()
    {
        return repository.getBooks();
    }
}
