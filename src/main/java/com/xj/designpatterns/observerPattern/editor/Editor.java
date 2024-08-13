package com.xj.designpatterns.observerPattern.editor;

import com.xj.designpatterns.observerPattern.publisher.EventManager;

import java.io.File;

/**
 * Editor 类是文件编辑器，它包含一个 EventManager 用于管理事件和监听器。openFile 方法打开文件并触发 "打开" 事件，saveFile 方法保存文件并触发 "保存" 事件。如果尝试保存未打开的文件，会抛出一个异常。
 * @author : xiongjun
 * @date : 2024/8/13 15:51
 */
public class Editor {

    public EventManager events;

    private File file;

    public Editor(){
        this.events = new EventManager("打开","保存");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        events.notify("打开",file);
    }

    public void saveFile() throws Exception {
        if (this.file != null){
            events.notify("保存",file);
        }else {
            throw new Exception("请先打开一个文件");
        }
    }

}
