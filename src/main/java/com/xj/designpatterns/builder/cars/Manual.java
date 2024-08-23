package com.xj.designpatterns.builder.cars;

import com.xj.designpatterns.builder.components.Engine;
import com.xj.designpatterns.builder.components.GPSNavigator;
import com.xj.designpatterns.builder.components.Transmission;
import com.xj.designpatterns.builder.components.TripComputer;

/**
 * @author : xiongjun
 * @date : 2024/8/23 10:15
 */
public class Manual {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("车类型: ").append(carType).append("\n");
        stringBuilder.append("座位数: ").append(seats).append("\n");
        stringBuilder.append("引擎: ").append(engine.getVolume()).append("+里程数: ").append(engine.getMileage()).append("\n");
        stringBuilder.append("变速器: ").append(transmission).append("\n");
        if (this.tripComputer != null){
            stringBuilder.append("行车电脑: ").append("功能正常").append("\n");
        }else {
            stringBuilder.append("行车电脑: ").append("无").append("\n");
        }
        if (this.gpsNavigator != null){
            stringBuilder.append("GPS导航: ").append(gpsNavigator.getRoute()).append("\n");
        }else {
            stringBuilder.append("GPS导航: ").append("无").append("\n");
        }
        return stringBuilder.toString();
    }

}
