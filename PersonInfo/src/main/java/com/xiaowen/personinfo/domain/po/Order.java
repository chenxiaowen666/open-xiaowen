package com.xiaowen.personinfo.domain.po;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaowen
 * @since 2025-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     */
    @TableId(value = "order_id", type = IdType.AUTO)
    private String orderId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 订单金额
     */
    private BigDecimal amount;

    /**
     * 状态（0:待支付,1:已支付,2:已取消）
     */
    private Integer status;

    /**
     * 收货地址
     */
    private String address;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
