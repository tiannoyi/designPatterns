package com.xj.designpatterns.proxy.some_cool_media_library;

import java.util.HashMap;

/**
 * 远程服务接口
 * @author : xiongjun
 * @date : 2024/9/12 15:55
 */
public interface ThirdPartyBilibiliLib {

    HashMap<String,Video> popularVideos();

    Video getVideo(String videoId);

}
