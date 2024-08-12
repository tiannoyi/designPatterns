package com.xj.designpatterns.decoratorPattern.decorators;

/**
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
