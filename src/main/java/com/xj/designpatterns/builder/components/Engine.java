package com.xj.designpatterns.builder.components;

/**
 * 汽车的一个组件
 * @author : xiongjun
 * @date : 2024/8/22 16:42
 */
public class Engine {

    private final double volume;

    private double mileage;

    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on(){
        started = true;
    }

    public void off(){
        started = false;
    }

    public boolean isStarted(){
        return started;
    }

    public void go(double mileage){
        if(started){
            this.mileage += mileage;
        }else {
            System.out.println("还不能跑，先打开引擎！");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage(){
        return mileage;
    }


}
