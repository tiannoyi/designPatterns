package com.xj.designpatterns.builder.builder;

import com.xj.designpatterns.builder.cars.CarType;
import com.xj.designpatterns.builder.cars.Manual;
import com.xj.designpatterns.builder.components.Engine;
import com.xj.designpatterns.builder.components.GPSNavigator;
import com.xj.designpatterns.builder.components.Transmission;
import com.xj.designpatterns.builder.components.TripComputer;

/**
 * CarManualBuilder
 * @author : xiongjun
 * @date : 2024/8/23 10:28
 */

public class CarManualBuilder implements Builder{

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarTpe(CarType tpe) {
        this.carType = tpe;
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

    public Manual getResult(){
        return new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
