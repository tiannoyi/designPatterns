package com.xj.designpatterns.builder.components;

/**
 * GPS，一个汽车的组件
 *
 * @author : xiongjun
 * @date : 2024/8/22 17:46
 */
public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        this.route = "广州南站到白云机场";
    }

    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }

}
