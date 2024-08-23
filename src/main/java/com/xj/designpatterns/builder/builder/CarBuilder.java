package com.xj.designpatterns.builder.builder;

import com.xj.designpatterns.builder.cars.Car;
import com.xj.designpatterns.builder.cars.CarType;
import com.xj.designpatterns.builder.components.Engine;
import com.xj.designpatterns.builder.components.GPSNavigator;
import com.xj.designpatterns.builder.components.Transmission;
import com.xj.designpatterns.builder.components.TripComputer;

/**
 * 汽车生成器
 * @author : xiongjun
 * @date : 2024/8/23 10:24
 */
public class CarBuilder implements Builder{

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public void setCarTpe(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult(){
        return new Car(carType,seats,engine,transmission,tripComputer,gpsNavigator);
    }
}
