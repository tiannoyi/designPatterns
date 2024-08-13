package com.xj.designpatterns.observerPattern.listeners;

import java.io.File;

/**
 * 定义了一个事件监听器需要实现的方法 update，用于接收事件通知。eventType 是事件的类型，比如 "打开" 或 "保存"，file 是被操作的文件对象。
 * @author : xiongjun
 * @date : 2024/8/13 15:46
 */
public interface EventListener {
    void update(String eventType, File file);
}
