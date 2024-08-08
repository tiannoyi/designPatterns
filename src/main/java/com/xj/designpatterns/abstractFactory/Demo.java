package com.xj.designpatterns.abstractFactory;

import com.xj.designpatterns.abstractFactory.app.Application;
import com.xj.designpatterns.abstractFactory.factories.GUIFactory;
import com.xj.designpatterns.abstractFactory.factories.MacOSFactory;
import com.xj.designpatterns.abstractFactory.factories.WindowsFactory;

/**
 * @author : xiongjun
 * @date : 2024/8/8 13:54
 */
public class Demo {

    /**
     * 应用程序在运行时选择工厂类型并创建它（通常在
     * 初始化阶段），具体取决于配置或环境
     * 变量。
     */
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")){
            factory = new MacOSFactory();
        }else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }

}
