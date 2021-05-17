package com.PWS.MongoDB.SpringbootMongoDB.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PWS.MongoDB.SpringbootMongoDB.MODEL.Expense;
import com.PWS.MongoDB.SpringbootMongoDB.REPOSITORY.ExpenseRepository;



@Service

public class ExpenseService {
   // @Autowired
    private final ExpenseRepository expenseRepository;
    public ExpenseService (ExpenseRepository expenseRepository) {
        this.expenseRepository=expenseRepository;
        
    }
    public void addExpense(Expense expense) {
        expenseRepository.insert(expense);
    }
    public Expense updateExpense(Expense expense) {
        Expense savedExpense = expenseRepository.findById(expense.getId()).orElseThrow(() -> new RuntimeException(String.format("Cannot Find Expense by ID %s", expense.getId())));
        savedExpense.setExpenseName(expense.getExpenseName());
        savedExpense.setExpenseCategory(expense.getExpenseCategory());
        savedExpense.setExpenseAmount(expense.getExpenseAmount());
 
        return expenseRepository.save(expense);
        
    }
    
    
    public List<Expense> getAllExpense() {
        return expenseRepository.findAll();
        
    }
    
    
    public Expense getExpenseByName(String name) {
        return expenseRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException(String.format("Cannot Find Expense by Name - %s", name)));
  
        
    }
    
    
    public void deleteExpense(String id) {
        expenseRepository.deleteById(id);
    }
    
    

}
