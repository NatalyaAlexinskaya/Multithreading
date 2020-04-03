package com.company.philosophers;

public class Table {
    public static void main(String[] args) {
        Fork leftFork = new Fork(1);
        Fork rightFork = new Fork(1);
        new Thread(new Philosopher("Аристотель", rightFork, leftFork)).start();
        new Thread(new Philosopher("Спиноза", rightFork, leftFork)).start();
        new Thread(new Philosopher("Аврелий", rightFork, leftFork)).start();
        new Thread(new Philosopher("Шопенгауэр", rightFork, leftFork)).start();
        new Thread(new Philosopher("Ницше", rightFork, leftFork)).start();
    }
}
