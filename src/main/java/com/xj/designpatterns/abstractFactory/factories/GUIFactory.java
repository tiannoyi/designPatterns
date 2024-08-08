package com.xj.designpatterns.abstractFactory.factories;

import com.xj.designpatterns.abstractFactory.buttons.Button;
import com.xj.designpatterns.abstractFactory.checkboxes.Checkbox;

/**
 * 抽象工厂了解所有（抽象）产品类型。
 * @author : xiongjun
 * @date : 2024/8/8 11:24
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();

}
