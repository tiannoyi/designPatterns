package com.xj.designpatterns.builder.director;

import com.xj.designpatterns.builder.builder.Builder;
import com.xj.designpatterns.builder.cars.CarType;
import com.xj.designpatterns.builder.components.Engine;
import com.xj.designpatterns.builder.components.GPSNavigator;
import com.xj.designpatterns.builder.components.Transmission;
import com.xj.designpatterns.builder.components.TripComputer;

/**
 * 主管控制生成器
 * Director 定义构建步骤的顺序。它通过通用构建器接口与构建器对象一起工作。因此它可能不知道正在构建什么产品。
 * @author : xiongjun
 * @date : 2024/8/23 10:33
 */
public class Director {

    public void constructSportsCar(Builder builder){
        builder.setCarTpe(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0,0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder){
        builder.setCarTpe(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2,0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder){
        builder.setCarTpe(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5,0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

}
