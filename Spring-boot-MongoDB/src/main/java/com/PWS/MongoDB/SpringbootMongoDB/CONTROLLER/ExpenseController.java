package com.PWS.MongoDB.SpringbootMongoDB.CONTROLLER;

import java.security.Principal;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.PWS.MongoDB.SpringbootMongoDB.MODEL.Expense;
import com.PWS.MongoDB.SpringbootMongoDB.REPOSITORY.ExpenseRepository;
import com.PWS.MongoDB.SpringbootMongoDB.SERVICE.ExpenseService;

@Controller

public class ExpenseController {
    private final ExpenseService expenseService;
    public ExpenseController (ExpenseService expenseService) {
        this.expenseService=expenseService;
        
    }
    @PostMapping("/add")
    public ResponseEntity addExpense(@RequestBody Expense expense) {
        expenseService.addExpense(expense);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
//    /*ResponseEntity represents the whole HTTP response: status code, headers, and body. 
//    As a result, we can use it to fully configure the HTTP response.
//    If we want to use it, we have to return it from the endpoint; Spring takes care of the rest.
//https://www.baeldung.com/spring-response-entity#:~:text=ResponseEntity%20represents%20the%20whole%20HTTP,ResponseEntity%20is%20a%20generic%20type.
//*/

    @PutMapping("/update")
    public Expense updateExpense(@RequestBody Expense expense) {
        expenseService.updateExpense(expense);
        return expenseService.updateExpense(expense);
    }
    @GetMapping("getAll")
    public ResponseEntity<List<Expense>> getAllExpense() {
        return ResponseEntity.ok(expenseService.getAllExpense());
        
        }
    @GetMapping("/get/{name}")
    public ResponseEntity<Expense> getExpenseByName(@PathVariable String name) {
        return ResponseEntity.ok(expenseService.getExpenseByName(name));
      
        
    }
    
    
    @DeleteMapping("/get/{id}")
    public ResponseEntity deleteExpense(@PathVariable String id) {
        expenseService.deleteExpense(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping("/login")

    public String loginPage() {
        return "login.jsp";
    }
    @RequestMapping("/logout-success")
    public String logoutPage() {
        return "logout.jsp";
    }
    @RequestMapping("user")
    @ResponseBody
    public Principal user(Principal principal)
    {
        return principal;
    }
    
}
//ResponseEntity..status.. its fields
