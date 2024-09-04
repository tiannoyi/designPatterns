package com.xj.designpatterns.iterator.iterators;

import com.xj.designpatterns.iterator.profile.Profile;

/**
 * 定义档案接口
 * @author : xiongjun
 * @date : 2024/9/4 17:14
 */
public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();

}
