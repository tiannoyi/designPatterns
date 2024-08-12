package com.xj.designpatterns.decoratorPattern.decorators;

/**
 * DataSource 接口定义了两个方法：writeData(String data) 和 readData()。这些方法分别用于写入和读取数据。
 * @author : xiongjun
 * @date : 2024/8/8 14:37
 */
public interface DataSource {

    void writeData(String data);

    String readData();

}
