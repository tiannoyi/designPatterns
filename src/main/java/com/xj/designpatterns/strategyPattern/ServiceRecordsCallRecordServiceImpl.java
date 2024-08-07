package com.xj.designpatterns.strategyPattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author : xiongjun
 * @date : 2024/8/7 16:03
 */
@Service
@Slf4j
public class ServiceRecordsCallRecordServiceImpl implements SummaryTaskHandlerService {

    @Override
    public TaskTypeEnum getTaskType() {
        return TaskTypeEnum.SERVICE_RECORDS_CALL_RECORD_DETECTION;
    }

    @Override
    public boolean handle(AuroralqTaskPushDTO dto) {
        // 业务逻辑
        return true;
    }

}