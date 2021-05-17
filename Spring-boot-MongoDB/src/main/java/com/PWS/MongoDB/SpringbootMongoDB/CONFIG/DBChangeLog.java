package com.PWS.MongoDB.SpringbootMongoDB.CONFIG;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static com.PWS.MongoDB.SpringbootMongoDB.MODEL.ExpenseCategory.*;// imp
import com.PWS.MongoDB.SpringbootMongoDB.MODEL.Expense;
import com.PWS.MongoDB.SpringbootMongoDB.MODEL.ExpenseCategory;
import com.PWS.MongoDB.SpringbootMongoDB.REPOSITORY.ExpenseRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

@ChangeLog
public class DBChangeLog {

//
//    private ExpenseCategory ENTERTAINMENT;
//    private ExpenseCategory MISC;
//    private ExpenseCategory UTILITIES;

    @ChangeSet(order = "001", id = "seedDatabase", author = "Sai")
    public void seedDatabase(ExpenseRepository expenseRepository) {
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(createNewExpense("DISNEY+", ENTERTAINMENT, BigDecimal.valueOf(60)));
        expenseList.add(createNewExpense("Dinner", RESTAURENTS, BigDecimal.valueOf(60)));
        expenseList.add(createNewExpense("Netflix", ENTERTAINMENT, BigDecimal.valueOf(10)));
        expenseList.add(createNewExpense("Gym", MISC, BigDecimal.valueOf(20)));
        expenseList.add(createNewExpense("Internet", UTILITIES, BigDecimal.valueOf(30)));
 
        expenseRepository.insert(expenseList);
    }
 
    private Expense createNewExpense(String expenseName, ExpenseCategory expenseCategory, BigDecimal amount) {
        Expense expense = new Expense();
        expense.setExpenseName(expenseName);
        expense.setExpenseAmount(amount);
        expense.setExpenseCategory(expenseCategory);
        return expense;
    }
    

}
