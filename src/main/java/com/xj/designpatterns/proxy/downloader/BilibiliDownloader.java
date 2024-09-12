package com.xj.designpatterns.proxy.downloader;

import com.xj.designpatterns.proxy.some_cool_media_library.ThirdPartyBilibiliLib;
import com.xj.designpatterns.proxy.some_cool_media_library.Video;

import java.util.HashMap;

/**
 *  媒体下载应用
 * @author : xiongjun
 * @date : 2024/9/12 16:31
 */
public class BilibiliDownloader {

    private ThirdPartyBilibiliLib bilibiliService;

    public BilibiliDownloader(ThirdPartyBilibiliLib bilibiliService) {
        this.bilibiliService = bilibiliService;
    }


    public void renderVideoPage(String videoId){
        Video video = bilibiliService.getVideo(videoId);
        System.out.println("\n-------------------");
        System.out.println("页面渲染中...");
        System.out.println("id: " + video.getId());
        System.out.println("title: " + video.getTitle());
        System.out.println("video: " + video.getData());
        System.out.println("-------------------\n");
    }

    public void renderPopularVideos(){
        HashMap<String, Video> list = bilibiliService.popularVideos();
        System.out.println("\n-------------------");
        System.out.println("页面渲染中...");
        for (Video video : list.values()) {
            System.out.println("id: " + video.getId() + " / title: " + video.getTitle());
        }
        System.out.println("-------------------\n");
    }


}
