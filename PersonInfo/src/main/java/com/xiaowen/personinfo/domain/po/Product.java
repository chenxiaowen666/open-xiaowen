package com.xiaowen.personinfo.domain.po;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    @TableId(value = "product_id", type = IdType.AUTO)
    private Integer productId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 分类
     */
    private String category;

    /**
     * 是否删除（0:未删除,1:已删除）
     */
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
