package repository;

import domain.Account;
import domain.Transaction;

import java.util.*;

public class TransactionRepository {
    private final Map<String, List<Transaction>> txByAccount = new HashMap<>();

    public void add(Transaction transaction) {
        List<Transaction> list = txByAccount.computeIfAbsent(transaction.getAccountNumber(),k -> new ArrayList<>());
        list.add(transaction);
    }

    public List<Transaction> findByAccountNumber(String accountNumber) {
        return new ArrayList<>(txByAccount.getOrDefault(accountNumber, Collections.emptyList()));
    }
}
