package com.xj.designpatterns.factoryMethod.buttons;

/**
 * html按钮实现
 * @author : xiongjun
 * @date : 2024/8/8 09:52
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>测试按钮</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("点击按钮! 显示 - 'Hello World!'");
    }
}
