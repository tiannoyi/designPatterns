package com.xj.designpatterns.singletonPattern.threadSafety;



/**
 * @author : xiongjun
 * @date : 2024/8/7 17:18
 */
public class DemoMultiThread {


    public static void main(String[] args) {
        System.out.println("如果您看到相同的值，则单例被重用" + "\n" +
                "如果您看到不同的值，则创建了 2 个单例" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new DemoMultiThread.ThreadFoo());
        Thread threadBar = new Thread(new DemoMultiThread.ThreadBar());
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
