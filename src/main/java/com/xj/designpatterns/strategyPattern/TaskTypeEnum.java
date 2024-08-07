package com.xj.designpatterns.strategyPattern;

import lombok.Getter;

/**
 * @author : xiongjun
 * @date : 2024/8/7 15:57
 */
@Getter
public enum TaskTypeEnum {

    /**
     * 订单检测
     */
    ORDER("order"),
    /**
     * 服务记录微信检测
     */
    SERVICE_RECORDS_WECHAT_DETECTION("serviceRecordsWeChatDetection"),
    /**
     * 服务记录通话检测
     */
    SERVICE_RECORDS_CALL_RECORD_DETECTION("serviceRecordsCallRecordDetection"),
    /**
     * 服务记录IM检测
     */
    SERVICE_RECORDS_IM_RECORD_DETECTION("serviceRecordsImRecordDetection"),
    /**
     * 服务记录sms检测
     */
    SERVICE_RECORDS_SMS_RECORD_DETECTION("serviceRecordsSmsRecordDetection"),
    /**
     * 日常检测
     */
    DAILY("daily");

    private final String value;

    TaskTypeEnum(String value) {
        this.value = value;
    }


}