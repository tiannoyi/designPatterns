package com.xj.designpatterns.builder;

import com.xj.designpatterns.builder.builder.CarBuilder;
import com.xj.designpatterns.builder.builder.CarManualBuilder;
import com.xj.designpatterns.builder.cars.Car;
import com.xj.designpatterns.builder.cars.CarType;
import com.xj.designpatterns.builder.cars.Manual;
import com.xj.designpatterns.builder.director.Director;

/**
 * @author : xiongjun
 * @date : 2024/8/22 16:36
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();


        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();

        director.constructSportsCar(carManualBuilder);
        Manual carManual = carManualBuilder.getResult();
        System.out.println(carManual.print());

    }

}
