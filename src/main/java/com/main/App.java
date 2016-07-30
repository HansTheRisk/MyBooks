package com.main;

import com.domain.service.book.BookService;
import com.domain.book.Book;
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
        Book book = new Book();
//        book.setID(repository.count()+1);
//        book.setTitle("test");
//        book.setAuthor("author");
//        book.setISBN(new ISBN("9788379640904"));
//        book.setLang(Locale.CHINA);
//        book.setYear(new Date(1994));
//        repository.insert(book);
        System.out.println(service.getBooks());
    }

    @Autowired
    private BookService service;
}
