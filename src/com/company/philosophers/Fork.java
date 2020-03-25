package com.company.philosophers;

import java.util.concurrent.Semaphore;

public class Fork extends Semaphore {
    public Fork(int permits) {
        super(permits);
    }
}
