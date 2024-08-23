package com.xj.designpatterns.builder.components;

import com.xj.designpatterns.builder.cars.Car;

/**
 * @author : xiongjun
 * @date : 2024/8/22 17:49
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

}
