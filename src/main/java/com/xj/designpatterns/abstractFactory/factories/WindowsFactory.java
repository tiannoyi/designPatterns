package com.xj.designpatterns.abstractFactory.factories;

import com.xj.designpatterns.abstractFactory.buttons.Button;
import com.xj.designpatterns.abstractFactory.buttons.WindowsButton;
import com.xj.designpatterns.abstractFactory.checkboxes.Checkbox;
import com.xj.designpatterns.abstractFactory.checkboxes.WindowsCheckbox;

/**
 * 每个具体的工厂都扩展了基础工厂，并负责创建
 * 单一品种的产品
 * @author : xiongjun
 * @date : 2024/8/8 11:26
 */
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
