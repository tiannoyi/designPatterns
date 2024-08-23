package com.xj.designpatterns.builder.builder;

import com.xj.designpatterns.builder.cars.CarType;
import com.xj.designpatterns.builder.components.Engine;
import com.xj.designpatterns.builder.components.GPSNavigator;
import com.xj.designpatterns.builder.components.Transmission;
import com.xj.designpatterns.builder.components.TripComputer;

/**
 * 通用生成器接口
 * @author : xiongjun
 * @date : 2024/8/22 17:50
 */
public interface Builder {

    void setCarTpe(CarType tpe);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);


}
