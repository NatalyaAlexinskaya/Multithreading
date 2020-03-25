package com.company.philosophers;

public class Philosopher implements Runnable {
    private String name;
    private Fork leftFork;
    private Fork rightFork;

    public Philosopher(String name, Fork leftFork, Fork rightFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private enum STATES {
        THINKING,
        EATING,
        LEFT_FORK,
        RIGHT_FORK;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(name + " " + STATES.THINKING);
            try {
                rightFork.acquire();
                System.out.println(name + " берет " + STATES.RIGHT_FORK);
                leftFork.acquire();
                System.out.println(name + " берет " + STATES.LEFT_FORK);
                System.out.println(name + " " + STATES.EATING);
                Thread.sleep(1000);
                System.out.println(name + " кладет " + STATES.RIGHT_FORK);
                rightFork.release();
                System.out.println(name + " кладет " + STATES.LEFT_FORK);
                leftFork.release();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
