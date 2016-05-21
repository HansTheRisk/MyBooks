package com.repository.book;

import com.domain.book.Book;
import com.domain.book.BookID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookRepository extends MongoRepository<Book, BookID>
{

}
