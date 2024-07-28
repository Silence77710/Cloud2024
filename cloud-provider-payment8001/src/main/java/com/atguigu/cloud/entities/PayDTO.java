package com.atguigu.cloud.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <支付实体类>
 *
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(title = "交付交易表入参")
public class PayDTO implements Serializable {

    @Schema(title = "主键")
    private Integer id;

    //支付流水号
    @Schema(title = "流水号")
    private String payNo;
    //订单流水号
    private String orderNo;
    //用户账号ID
    private Integer userId;

    //交易金额
    private BigDecimal amount;
}

