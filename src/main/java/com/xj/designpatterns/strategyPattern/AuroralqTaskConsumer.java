package com.xj.designpatterns.strategyPattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : xiongjun
 * @date : 2024/8/7 16:05
 */
@Component
@Slf4j
public class AuroralqTaskConsumer {

    @Autowired
    private SummaryTaskHandlerFactory summaryTaskHandlerFactory;


    private boolean handleMessage(AuroralqTaskPushDTO dto){
        SummaryTaskHandlerService handlerService = summaryTaskHandlerFactory.getHandler(dto.getTaskType());
        if (handlerService != null) {
            return handlerService.handle(dto);
        } else {
            log.warn("未知的任务类型,直接消费成功:{}", dto.getTaskType());
        }
        return false;
    }

}
