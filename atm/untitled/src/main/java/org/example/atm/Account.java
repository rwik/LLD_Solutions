package org.example.atm;

public class Account {
    private final int accountNumber;
    private double balance;
    private final String name;

    public Account(int accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }

    public void debit(double amount){
        balance = balance - amount;

    }
    public void credit(double amount){
        balance = balance + amount;

    }

}
