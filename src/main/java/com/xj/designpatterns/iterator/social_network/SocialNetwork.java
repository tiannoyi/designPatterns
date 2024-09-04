package com.xj.designpatterns.iterator.social_network;

import com.xj.designpatterns.iterator.iterators.ProfileIterator;

/**
 * 社交网络接口
 * @author : xiongjun
 * @date : 2024/9/4 17:24
 */
public interface SocialNetwork {

    /**
     * 创建好友迭代器
     * @param profileEmail 档案邮箱
     * @return  好友迭代器
     */
    ProfileIterator createFriendsIterator(String profileEmail);

    /**
     * 创建同事迭代器
     * @param profileEmail 档案邮箱
     * @return 同事迭代器
     */
    ProfileIterator createCoworkersIterator(String profileEmail);


}
