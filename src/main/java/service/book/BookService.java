package service.book;

import mongo.service.MongoUniversallyIdentifiableService;
import domain.book.Book;
import org.springframework.stereotype.Component;

import java.util.Collection;

import static com.mongodb.assertions.Assertions.notNull;

@Component
public class BookService extends MongoUniversallyIdentifiableService<Book>
{
    public Collection<Book> getBooks()
    {
        return repository.findAll();
    }

//    public Book getBook(UUID id)
//    {
//        notNull("Book id", id);
//        return repository.findByUuid(id);
//    }
//
//    public Iterable<Book> getBooks(Iterable<UUID> ids)
//    {
//        notNull("Book ids", ids);
//        return repository.findAll(ids);
//    }
//
//    public Book insertBook(Book service.book)
//    {
//        notNull("Book", service.book);
//        return repository.insert(service.book);
//    }
}
