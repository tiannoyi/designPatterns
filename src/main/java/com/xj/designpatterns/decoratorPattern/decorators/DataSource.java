package com.xj.designpatterns.decoratorPattern.decorators;

/**
 * @author : xiongjun
 * @date : 2024/8/8 14:37
 */
public interface DataSource {

    void writeData(String data);

    String readData();

}
