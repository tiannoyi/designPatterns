package com.xj.designpatterns.factoryMethod.factory;

import com.xj.designpatterns.factoryMethod.buttons.Button;
import com.xj.designpatterns.factoryMethod.buttons.HtmlButton;

/**
 * html按钮具体创建者
 * @author : xiongjun
 * @date : 2024/8/8 10:02
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
