package com.mybooks.app.app;

import com.mybooks.app.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

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
//        Book service.book = new Book();
//        service.book.setTitle("testTwo");
//        service.book.setAuthor("author");
//        service.book.setISBN(new ISBN("9788379640904"));
//        service.book.setLang(Locale.ENGLISH);
//        service.book.setYear(new Date(1985));
//        service.save(service.book);
        System.out.println(service.findByUUID("1a07bc2a-64b2-4a0b-8e04-4070006dd144"));
    }

    @Autowired
    private BookService service;
}
