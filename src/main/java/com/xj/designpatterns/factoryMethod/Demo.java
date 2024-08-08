package com.xj.designpatterns.factoryMethod;

import com.xj.designpatterns.factoryMethod.factory.Dialog;
import com.xj.designpatterns.factoryMethod.factory.HtmlDialog;
import com.xj.designpatterns.factoryMethod.factory.WindowsDialog;

/**
 * 客户端代码
 * 测试类，所有使用逻辑都在这里
 * @author : xiongjun
 * @date : 2024/8/8 10:04
 */
public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    public static void configure(){
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }

    public static void runBusinessLogic(){
        dialog.renderWindow();
    }

}
