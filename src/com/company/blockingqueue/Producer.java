package com.company.blockingqueue;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                store.getQueue().put(i);
                System.out.println("Производитель добавил 1 товар.");
                System.out.println("Товаров на складе " + store.getQueue().size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
