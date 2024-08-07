package com.xj.designpatterns.singletonPattern.threadDemo;

/**
 * 基础单例，单线程
 * @author : xiongjun
 * @date : 2024/8/7 16:34
 */
public class DemoSingleThread {



    public static void main(String[] args) {
        //单线程执行
        //demoSingleThread();
        //多线程执行
        demoMultiThread();
    }


    /**
     * 单线程
     */
    public static void demoSingleThread(){
        System.out.println("如果您看到相同的值，则单例被重用" + "\n" +
                "如果您看到不同的值，则创建了 2 个单例" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }


    /**
     * 多线程
     */
    public static void demoMultiThread(){
        System.out.println("如果您看到相同的值，则单例被重用" + "\n" +
                "如果您看到不同的值，则创建了 2 个单例" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

}
