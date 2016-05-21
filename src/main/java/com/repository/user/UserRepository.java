package com.repository.user;

import com.domain.book.Book;
import com.domain.book.BookID;
import com.domain.user.User;
import com.domain.user.UserID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository extends MongoRepository<User, UserID>
{
//    public Book getUser(UserID bookID);
//
//    public List<Book> getAllUsers();
//
//    public List<Book> getAllUsers(Sort sort);
//
//    public Page<Book> getAllUsers(Pageable pageable);
//
//    public <S extends User> S insertUser(S entity);
//
//    public <S extends User> List<S> insertUser(Iterable<S> entities);
//
//    public void deleteUser(BookID bookID);
//
//    public void deleteUser(Book book);
//
//    public void deleteUser(Iterable<? extends Book> iterable);
//
//    public void deleteAllUsers();
}
