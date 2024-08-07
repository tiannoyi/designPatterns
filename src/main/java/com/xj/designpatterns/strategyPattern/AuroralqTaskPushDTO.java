package com.xj.designpatterns.strategyPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author : xiongjun
 * @date : 2024/8/7 15:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuroralqTaskPushDTO{

    /**
     * 风控级别
     */
    @NotNull(message = "风控级别不能为空")
    private Integer riskLev;

    /**
     * 任务类型
     */
    @NotBlank(message = "任务id不能为空")
    private String taskType;

    /**
     * 消息体
     */
    @NotBlank(message = "消息体不能为空")
    private String msgBody;


}
