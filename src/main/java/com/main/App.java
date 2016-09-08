package com.main;

import com.domain.book.Book;
import com.domain.isbn.ISBN;
import com.domain.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Date;
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
        book.setTitle("testTwo");
        book.setAuthor("author");
        book.setISBN(new ISBN("9788379640904"));
        book.setLang(Locale.ENGLISH);
        book.setYear(new Date(1985));
        service.save(book);
         System.out.println(service.getBooks());
    }

    @Autowired
    private BookService service;
}
