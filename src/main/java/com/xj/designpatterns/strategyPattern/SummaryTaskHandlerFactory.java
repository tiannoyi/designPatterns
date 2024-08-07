package com.xj.designpatterns.strategyPattern;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : xiongjun
 * @date : 2024/8/7 16:04
 */
@Component
public class SummaryTaskHandlerFactory implements InitializingBean {

    @Autowired
    List<SummaryTaskHandlerService> summaryTaskHandlerServices;

    private static final Map<String, SummaryTaskHandlerService> HANDLER_MAP = new HashMap<>();


    @Override
    public void afterPropertiesSet() {
        summaryTaskHandlerServices.forEach(v -> HANDLER_MAP.put(v.getTaskType().getValue(),v));
    }

    public SummaryTaskHandlerService getHandler(String taskType) {
        return HANDLER_MAP.get(taskType);
    }
}