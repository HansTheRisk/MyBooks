package com.main;

import com.domain.book.Book;
import com.domain.book.BookID;
import com.domain.isbn.ISBN;;
import com.repository.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Locale;

@Component
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new FileSystemXmlApplicationContext("main-context.xml");
        App app = context.getBean(App.class);
        app.initialise();
    }

    private void initialise()
    {
        Book book = new Book();
        book.setID(repository.count()+1);
        book.setTitle("test");
        book.setAuthor("author");
        book.setISBN(new ISBN("9788379640904"));
        book.setLang(Locale.CHINA);
        book.setYear(new Date(1994));
        repository.insert(book);
        System.out.println(repository.findAll());
    }

    @Autowired
    private BookRepository repository;
}
