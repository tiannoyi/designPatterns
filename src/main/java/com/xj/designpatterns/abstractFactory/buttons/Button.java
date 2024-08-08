package com.xj.designpatterns.abstractFactory.buttons;

/**
 * @author : xiongjun
 * @date : 2024/8/8 11:10
 */
public interface Button {

    /**
     * 抽象工厂假设你有几个产品家族，
     * 它们被构造成分离的类层次结构（按钮/复选框）。同一家族的所有产品
     * 都有一个共同的接口。
     *
     * 公共的接口
     */
    void paint();

}
