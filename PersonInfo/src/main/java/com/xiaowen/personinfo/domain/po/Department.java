package com.xiaowen.personinfo.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门ID
     */
    @TableId(value = "dept_id", type = IdType.AUTO)
    private Integer deptId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 上级部门ID
     */
    private Integer parentId;

    /**
     * 部门负责人ID（关联 user.id）
     */
    private Integer managerId;


}
