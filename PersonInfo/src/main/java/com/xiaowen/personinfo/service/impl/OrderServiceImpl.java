package com.xiaowen.personinfo.service.impl;

import com.xiaowen.personinfo.domain.po.Order;
import com.xiaowen.personinfo.mapper.OrderMapper;
import com.xiaowen.personinfo.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaowen
 * @since 2025-02-27
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
