package com.company.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Store {
    private BlockingQueue<Integer> queue;

    public Store() {
        queue = new ArrayBlockingQueue<>(3);
    }

    public BlockingQueue<Integer> getQueue() {
        return queue;
    }
}
