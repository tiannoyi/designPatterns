package com.xj.designpatterns.strategyPattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author : xiongjun
 * @date : 2024/8/7 16:02
 */
@Service
@Slf4j
public class ServiceRecordsWeChatServiceImpl implements SummaryTaskHandlerService {

    @Override
    public TaskTypeEnum getTaskType() {
        return TaskTypeEnum.SERVICE_RECORDS_WECHAT_DETECTION;
    }

    @Override
    public boolean handle(AuroralqTaskPushDTO dto) {
        // 业务逻辑
        return true;
    }

}
