package com.company.bank;

public class BankUser implements Runnable{
    String name;

    public BankUser(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            int number = numberRandom();
            if (Bank.hasEnoughMoney(name, number)) {
                Bank.transferMoney(number);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }
        }
    }

    private int numberRandom() {
        return (int) (Math.random() * 200);
    }
}
