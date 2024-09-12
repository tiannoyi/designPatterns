package com.xj.designpatterns.proxy;

import com.xj.designpatterns.proxy.downloader.BilibiliDownloader;
import com.xj.designpatterns.proxy.proxy.BilibiliCacheProxy;
import com.xj.designpatterns.proxy.some_cool_media_library.ThirdPartyBilibiliClass;

/**
 * @author : xiongjun
 * @date : 2024/9/12 15:53
 */
public class Demo {

    public static void main(String[] args) {
        BilibiliDownloader naiveDownloader = new BilibiliDownloader(new ThirdPartyBilibiliClass());
        BilibiliDownloader smartDownloader = new BilibiliDownloader(new BilibiliCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("普通下载器耗时：" + (naive-smart) + "ms");

    }

    private static long test(BilibiliDownloader downloader){
        long startTime = System.currentTimeMillis();

        // 用户访问热门视频
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("mkafksangasj");
        // 用户访问页面
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("asdfas3ffasd");

        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("时间消耗：" + endTime + "ms\n");
        return endTime;
    }

}
