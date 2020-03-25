package com.company.bank;

public class Bank {
    private static long moneyAmount = 3000;

    public static synchronized void transferMoney(int amount) {
        moneyAmount -= amount;
        System.out.println("Остаток на счету " + moneyAmount);
    }

    public static synchronized boolean hasEnoughMoney(String name, int amount) {
        System.out.println(name + " пытается снять деньги со счета в количестве " + amount + " единиц");
        if (moneyAmount - amount < 0) {
            System.out.println("Недостаточно средств!");
            return false;
        }
        return true;
    }
}
