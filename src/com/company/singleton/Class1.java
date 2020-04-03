package com.company.singleton;

public class Class1 implements Runnable {
    MySingeleton first;
    MySingeleton second;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " выполняет задание по созданию объекта.");
        first = MySingeleton.getInstance();
        System.out.println("Объект создан.");
        second = MySingeleton.getInstance();
        System.out.println("Объект создан.");
        boolean check = first == second;
        System.out.println("Эти объекты идентичны? - " + check);
    }
}
