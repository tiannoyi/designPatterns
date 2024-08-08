package com.xj.designpatterns.abstractFactory.buttons;

/**
 * @author : xiongjun
 * @date : 2024/8/8 11:20
 */
public class MacOSButton implements Button{
    /**
     * 所有产品系列都具有相同的品种（MacOS/Windows）。
     *
     * 这是按钮的 MacOS 变体。
     */
    @Override
    public void paint() {
        System.out.println("您已经创建了 MacOSButton.");
    }
}
