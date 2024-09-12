package com.xj.designpatterns.proxy.some_cool_media_library;

import java.util.HashMap;

/**
 * 远程服务实现
 * @author : xiongjun
 * @date : 2024/9/12 15:58
 */
public class ThirdPartyBilibiliClass implements ThirdPartyBilibiliLib{

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.bilibili.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.bilibili.com/" + videoId);
        return getSomeVideo(videoId);
    }

    //-----------------------模拟网络延迟


    private int random(int min,int max){
        return min + (int) (Math.random() * (max - min + 1));
    }

    private void experienceNetworkLatency(){
        int randomLatency = random(5,10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void connectToServer(String server){
        System.out.println("连接到" + server + "...");
        experienceNetworkLatency();
        System.out.println("连接成功！");
    }

    private HashMap<String,Video> getRandomVideos(){
        System.out.println("获取视频列表...");
        experienceNetworkLatency();
        HashMap<String,Video> hmap = new HashMap<>();
        hmap.put("catzzzzzzzzz",new Video("sadgahasgdas","我不是赵日天.avi"));
        hmap.put("mkafksangasj",new Video("mkafksangasj","原批大本营.mp4"));
        hmap.put("dancesvideoo",new Video("asdfas3ffasd","母猪的产后护理.mpq"));
        hmap.put("dlsdk5jfslaf",new Video("dlsdk5jfslaf","亚拉那一卡.mov"));
        hmap.put("3sdfgsd1j333",new Video("3sdfgsd1j333","giligili.avi"));

        System.out.println("视频列表获取成功！");
        return hmap;
    }

    private Video getSomeVideo(String videoId){
        System.out.println("获取视频信息...");

        experienceNetworkLatency();
        Video video = new Video(videoId, "视频标题");

        System.out.println("视频信息获取成功！");
        return video;
    }

}
