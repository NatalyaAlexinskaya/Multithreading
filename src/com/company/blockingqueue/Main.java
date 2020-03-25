package com.company.blockingqueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new Producer(store));
        service.submit(new Consumer(store));

        service.shutdown();
    }
}
