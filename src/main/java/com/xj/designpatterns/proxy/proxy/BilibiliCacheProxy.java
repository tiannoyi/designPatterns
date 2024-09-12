package com.xj.designpatterns.proxy.proxy;

import com.xj.designpatterns.proxy.some_cool_media_library.ThirdPartyBilibiliClass;
import com.xj.designpatterns.proxy.some_cool_media_library.ThirdPartyBilibiliLib;
import com.xj.designpatterns.proxy.some_cool_media_library.Video;

import java.util.HashMap;

/**
 * 缓存代理代理类
 * @author : xiongjun
 * @date : 2024/9/12 16:20
 */
public class BilibiliCacheProxy implements ThirdPartyBilibiliLib {

    private ThirdPartyBilibiliLib bilibiliServer;
    private HashMap<String,Video> cachePopular = new HashMap<>();
    private HashMap<String,Video> cacheAll = new HashMap<>();


    public BilibiliCacheProxy() {
        this.bilibiliServer = new ThirdPartyBilibiliClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()){
            cachePopular = bilibiliServer.popularVideos();
        }else {
            System.out.println("从缓存中获取热门视频列表");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null){
            video = bilibiliServer.getVideo(videoId);
            cacheAll.put(videoId,video);
        }else {
            System.out.println("从缓存中获取视频" + videoId);
        }
        return video;
    }

    public void reset(){
        cachePopular.clear();
        cacheAll.clear();
    }
}
