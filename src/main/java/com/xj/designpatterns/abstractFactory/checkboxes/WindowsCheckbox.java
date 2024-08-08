package com.xj.designpatterns.abstractFactory.checkboxes;

/**
 * 所有产品系列都具有相同的品种（MacOS/Windows）。
 * 这是复选框的变体。
 * @author : xiongjun
 * @date : 2024/8/8 11:23
 */
public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("您已经创建了 WindowsCheckbox.");
    }
}
