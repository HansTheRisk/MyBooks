package com.repository.user;

import com.constants.database.Database;
import com.controller.MongoDBController;
import com.domain.user.User;
import com.domain.user.UserID;
import com.mongo.repository.MongoDBRepository;
import org.springframework.stereotype.Component;

@Component
public class UserRepository extends MongoDBRepository
{
    public UserRepository()
    {
        super(MongoDBController.getDatabase(Database.DEFAULT.toString()));
    }

    public void createUser(User user)
    {

    }

    public User getUser(UserID id)
    {
        return null;
    }
}
