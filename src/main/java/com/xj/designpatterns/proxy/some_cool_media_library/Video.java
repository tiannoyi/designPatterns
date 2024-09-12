package com.xj.designpatterns.proxy.some_cool_media_library;

import lombok.Data;

/**
 * 视频文件
 * @author : xiongjun
 * @date : 2024/9/12 15:55
 */
@Data
public class Video {

    private String id;

    private String title;

    private String data;

    public Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
