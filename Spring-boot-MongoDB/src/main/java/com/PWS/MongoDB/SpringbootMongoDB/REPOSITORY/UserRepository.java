package com.PWS.MongoDB.SpringbootMongoDB.REPOSITORY;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import  com.PWS.MongoDB.SpringbootMongoDB.MODEL.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);

}
