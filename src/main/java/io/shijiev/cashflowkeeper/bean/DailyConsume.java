package io.shijiev.cashflowkeeper.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author shijiev(成行技术)
 * @version 1.0
 * @description 日常消费信息实体类
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DailyConsume implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * ID
     * */
    private Long id;
    /**
     * 用户ID
     * */
    private Long userId;
    /**
     * 用户名称
     * */
    private String userName;
    /**
     * 消费场景
     * */
    private String consumeScene;
    /**
     * 消费事件
     * */
    private String consumeEvent;
    /**
     * 消费金额（分）
     * */
    private Long consumeAmountF;
    /**
     * 消费金额（元）
     * */
    private BigDecimal consumeAmountY;
    /**
     * 标签
     * */
    private String tags;
}
