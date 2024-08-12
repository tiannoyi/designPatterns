package com.xj.designpatterns.decoratorPattern.decorators;

/**
 * DataSourceDecorator 是一个抽象类，它实现了 DataSource 接口，并包含一个 DataSource 类型的成员变量 dataSource。
 * 这个类的作用是为具体的装饰器提供一个基础，可以在不改变现有 DataSource 实现的情况下添加新功能。
 * @author : xiongjun
 * @date : 2024/8/12 15:07
 */
public abstract class DataSourceDecorator implements DataSource{
    private DataSource dataSource;

    DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }

}
