package com.xj.designpatterns.singletonPattern.threadSafety;

/**
 * @author : xiongjun
 * @date : 2024/8/7 17:10
 */
public final class Singleton {

    // 必须将字段声明为volatile，以便双重检查锁定能够正确工作。
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        // 私有构造函数防止实例化
        this.value = value;
    }


    /**
     * 解释
     * 第一次检查：首先检查instance是否为null，如果不是null，直接返回实例。这避免了不必要的同步开销。
     * 同步块：如果instance为null，进入同步块。同步块保证只有一个线程能初始化instance。
     * 第二次检查：进入同步块后，再次检查instance是否为null。因为在第一个检查到进入同步块的过程中，可能有其他线程已经创建了实例。因此需要再次检查instance是否为null。
     * volatile关键字的作用
     * volatile关键字保证了多个线程能正确处理instance变量。它确保了对instance的写操作对所有线程可见，避免了指令重排序的问题。没有volatile，即使双重检查锁定也可能会失败，因为instance的写操作可能被重排序，导致其他线程看到一个未完全初始化的实例。
     */
    public static Singleton getInstance(String value) {
        // 这里采用的方法称为双重检查锁定（DCL）。
        // 这种方法的目的是防止多个线程同时尝试获取单例实例时发生竞态条件，
        // 以避免创建多个实例。
        //
        // 可能看起来这里的`result`变量完全是多余的。
        // 然而，在Java中实现双重检查锁定时，有一个非常重要的注意事项，
        // 通过引入这个局部变量可以解决这个问题。
        Singleton result = instance;
        // 第一次检查
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            // 第二次检查
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }




}
