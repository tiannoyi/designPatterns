package com.xj.designpatterns.abstractFactory.app;

import com.xj.designpatterns.abstractFactory.buttons.Button;
import com.xj.designpatterns.abstractFactory.checkboxes.Checkbox;
import com.xj.designpatterns.abstractFactory.factories.GUIFactory;

/**
 * 工厂的用户不关心他们使用哪一个具体工厂，因为他们通过抽象接口
 * 使用工厂和产品。
 * @author : xiongjun
 * @date : 2024/8/8 11:27
 */
public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
