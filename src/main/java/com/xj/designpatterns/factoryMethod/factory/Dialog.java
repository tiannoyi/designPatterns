package com.xj.designpatterns.factoryMethod.factory;

import com.xj.designpatterns.factoryMethod.buttons.Button;

/**
 * 基础创建者
 * 基础工厂类。请注意，“工厂”只是该类的一个角色。它应该有一些核心业务逻辑，需要创建不同的产品。
 * @author : xiongjun
 * @date : 2024/8/8 09:58
 */
public abstract class Dialog {

    public void renderWindow(){
        //-- 其他逻辑 --

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * 子类将重写此方法以创建特定的按钮对象。
     */
    public abstract Button createButton();

}
