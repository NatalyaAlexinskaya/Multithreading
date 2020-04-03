package com.company.singleton;

public class MySingeleton {
    private static MySingeleton instance;

    private MySingeleton() {
    }

    public static MySingeleton getInstance() {
        if(instance == null) {
            synchronized(MySingeleton.class) {
                if(instance == null) {
                    instance = new MySingeleton();
                }
            }
        }
        return instance;
    }
}
