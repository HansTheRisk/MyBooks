package com.domain.book;

import com.domain.isbn.ISBN;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

// TODO Javadocs
public class Book
{
    public Book()
    {

    }

    public BookID getID()
    {
        return id;
    }

    public void setID(BookID id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Date getYear()
    {
        return year;
    }

    public void setYear(Date year)
    {
        this.year = year;
    }

    public Locale getLang()
    {
        return lang;
    }

    public void setLang(Locale lang)
    {
        this.lang = lang;
    }

    public ISBN getISBN()
    {
        return isbn;
    }

    public void setISBN(ISBN isbn)
    {
        this.isbn = isbn;
    }

    //////////////////////////////////////////
    // Private fields
    //////////////////////////////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(year, book.year) &&
                Objects.equals(lang, book.lang) &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, lang, isbn);
    }

    private BookID id;
    private String title;
    private String author;
    private Date year;
    private Locale lang;
    private ISBN isbn;
}
