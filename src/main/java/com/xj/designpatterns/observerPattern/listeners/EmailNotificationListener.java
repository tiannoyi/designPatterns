package com.xj.designpatterns.observerPattern.listeners;

import java.io.File;

/**
 * EmailNotificationListener 类也是 EventListener 的实现，它模拟了发送电子邮件的操作。在 update 方法中，它会打印一条消息，表示发送了一封电子邮件，通知某个文件被操作了。
 * @author : xiongjun
 * @date : 2024/8/13 15:55
 */
public class EmailNotificationListener implements EventListener{

    private String email;

    public EmailNotificationListener(String email){
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("发送电子邮件至 "+email+" : 有人对以下文件执行了 "+eventType+" 操作: "+file.getName());
    }
}
