package com.xj.designpatterns.observerPattern.publisher;


import com.xj.designpatterns.observerPattern.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * EventManager 管理不同事件类型的监听器。它允许客户端代码（如 Editor）订阅或取消订阅事件。notify 方法会通知所有订阅了某个事件的监听器，调用它们的 update 方法。
 * @author : xiongjun
 * @date : 2024/8/13 15:40
 */
public class EventManager {

    Map<String, List<EventListener>> listeners= new HashMap<>();

    public EventManager(String... operations){
        for (String operation : operations) {
            this.listeners.put(operation,new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file){
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType,file);
        }
    }


}
