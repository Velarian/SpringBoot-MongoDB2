package com.PWS.MongoDB.SpringbootMongoDB.MODEL;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("expense")// save info to MongoDB//<<
public class Expense {
    @Id
    private String id;
    @Field("name")
    @Indexed(unique = true)
    private String expenseName;
    @Field("category")
    private ExpenseCategory expenseCategory;
    @Field("amount")//<<
    private BigDecimal expenseAmount;//<<
    
    
    
//    public Expense(String id, BigDecimal expenseAmount,ExpenseCategory expenseCategory, String expenseName) {
//        super();
//        this.id = id;
//        this.expenseAmount = expenseAmount;
//        this.expenseCategory = expenseCategory;
//        this.expenseName = expenseName;
//    }



    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public String getExpenseName() {
        return expenseName;
    }



    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }



    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }



    public void setExpenseCategory(ExpenseCategory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }



    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }



    public void setExpenseAmount(BigDecimal expenseAmount) {
        this.expenseAmount = expenseAmount;
    }
    
   
    
    

}
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Document("expense")
//public class Expense {
//    @Id
//    private String id;
//    @Field("name")
//    @Indexed(unique = true)
//    private String expenseName;
//    @Field("category")
//    private ExpenseCategory expenseCategory;
//    @Field("amount")
//    private BigDecimal expenseAmount;
//}
