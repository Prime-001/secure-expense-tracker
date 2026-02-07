package com.exppensetracker.service;

import com.exppensetracker.entity.Expense;
import java.util.List;

public interface ExpenseService {
    Expense addExpense(Expense expense);
    List<Expense> getAllExpenses();
}

