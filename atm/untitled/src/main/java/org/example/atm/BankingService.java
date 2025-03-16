package org.example.atm;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BankingService {
    private final Map<Integer,Account> ac;

    public BankingService() {
        ac = new ConcurrentHashMap<>();
    }
    public void createAccount() {

    }

    public void getAccount() {

    }

    public void delAccount() {

    }
    public void processTransaction(Transaction transaction) {
        transaction.execute();
    }

    public void printAccounts() {
        ac.forEach((k,v) -> {
          System.out.println("Account: " + k);
          System.out.println(v);
        });
    }



}
