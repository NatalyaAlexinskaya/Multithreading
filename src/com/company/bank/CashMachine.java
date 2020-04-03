package com.company.bank;

public class CashMachine {
    public static void main(String[] args) {
        new Thread(new BankUser("User 1")).start();
        new Thread(new BankUser("User 2")).start();
        new Thread(new BankUser("User 3")).start();
        new Thread(new BankUser("User 4")).start();
    }
}
