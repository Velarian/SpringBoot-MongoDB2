package com.PWS.MongoDB.SpringbootMongoDB.REPOSITORY;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.PWS.MongoDB.SpringbootMongoDB.MODEL.Expense;

public interface ExpenseRepository extends MongoRepository<Expense, String>{

    @Query("{'name':?0}") // @Query("{'name':?0, 'Amount':?1 }")//<<
    Optional<Expense> findByName(String name);

   

}
