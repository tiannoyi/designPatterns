package com.xj.designpatterns.observerPattern.listeners;

import java.io.File;

/**
 * LogOpenListener 类实现了 EventListener 接口，用于将文件操作记录到日志文件中。update 方法会在对应的事件触发时执行，将事件类型和文件名打印到控制台，模拟保存到日志的行为。
 * @author : xiongjun
 * @date : 2024/8/13 15:57
 */
public class LogOpenListener implements EventListener {

    private File log;

    public LogOpenListener(String fileName){
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("保存到日志 "+log+" : 有人对以下文件执行了 "+eventType+" 操作: "+file.getName());
    }
}
