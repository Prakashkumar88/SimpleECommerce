package service;

import domain.Account;
import domain.Transaction;

import java.util.List;

public interface BankService {
    String openAccount(String name, String email, String accountType);
    List<Account> listAccounts();

    void deposit(String accountNUmber, Double amount, String note);

    void withDraw(String accountNumber, Double amount, String note);

    void transfer(String from, String to, Double amount, String note);

    List<Transaction> getStatement(String accountNumber);

    List<Account> searchAccountsByCustomerName(String q);
}
