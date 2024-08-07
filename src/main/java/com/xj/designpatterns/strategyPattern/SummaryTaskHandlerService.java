package com.xj.designpatterns.strategyPattern;

/**
 * @author : xiongjun
 * @date : 2024/8/7 15:57
 */
public interface SummaryTaskHandlerService {
    /**
     * 通过此方法判断对应的实现类
     **/
    TaskTypeEnum getTaskType();

    /**
     * 具体的实现方法
     **/
    boolean handle(AuroralqTaskPushDTO dto);

}
