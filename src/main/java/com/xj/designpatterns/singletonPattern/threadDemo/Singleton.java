package com.xj.designpatterns.singletonPattern.threadDemo;

/**
 * @author : xiongjun
 * @date : 2024/8/7 16:31
 */
public final class Singleton {

    private static Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

}
