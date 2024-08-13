package com.xj.designpatterns.observerPattern;

import com.xj.designpatterns.observerPattern.editor.Editor;
import com.xj.designpatterns.observerPattern.listeners.EmailNotificationListener;
import com.xj.designpatterns.observerPattern.listeners.LogOpenListener;

/**
 * @author : xiongjun
 * @date : 2024/8/13 15:39
 */
public class Demo {

    public static void main(String[] args) throws Exception {
        Editor editor = new Editor();
        editor.events.subscribe("打开", new LogOpenListener("/Users/admin/E/eeeeee/file.txt"));
        editor.events.subscribe("保存", new EmailNotificationListener("tiannoyi@email.com"));

        try {
            editor.openFile("/Users/admin/E/eeeeee/test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
