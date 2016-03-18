package com.main;

import com.controller.MongoDBController;
import com.domain.book.Book;
import com.domain.book.BookID;
import com.domain.isbn.ISBN;
import com.service.book.BookService;
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
        // STEP 1: Initialise constants
        //MongoDatabase database = MongoDBController.getDatabase(Database.DEFAULT.toString());
        //System.out.println(database.getName());
        // STEP 2: Initialise GUI
        Book book = new Book();
        book.setTitle("test");
        book.setAuthor("author");
        book.setISBN(new ISBN("9788379640904"));
        service.createBook(book);
        service.getBooks();
        System.out.println(service.getBooks());
        //if(MongoDBController.dropDatabase(Database.DEFAULT.toString()) == true)
            //System.out.println("Database " + database.getName() + " dropped.");

        MongoDBController.disconnect();
    }

    @Autowired
    private BookService service;
}
