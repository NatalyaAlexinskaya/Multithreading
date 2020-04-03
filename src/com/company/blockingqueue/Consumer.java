package com.company.blockingqueue;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(1000);
                store.getQueue().take();
                System.out.println("Покупатель купил 1 товар.");
                System.out.println("Товаров на складе " + store.getQueue().size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
