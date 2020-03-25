package com.company.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new Class1());
        service.submit(new Class1());

        service.shutdown();
    }
}
//Не ленивая инициализация является потокобезопасной и она гораздо меньше по количеству строчек кода.
//Ленивая инициализация в одном из вариантов написания имееет низкую производительность.
