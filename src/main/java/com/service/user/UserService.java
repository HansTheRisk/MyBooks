package com.service.user;

import com.mongo.repository.MongoDBRepository;
import com.repository.user.UserRepository;
import com.mongo.service.MongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService extends MongoDBService<MongoDBRepository>
{
    /**
     * @description Constructor for the class
     * @param repository object
     */
    @Autowired
    public UserService(UserRepository repository)
    {
        super(repository);
    }
}
