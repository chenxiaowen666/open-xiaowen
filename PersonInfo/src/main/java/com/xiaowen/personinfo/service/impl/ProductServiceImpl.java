package com.xiaowen.personinfo.service.impl;

import com.xiaowen.personinfo.domain.po.Product;
import com.xiaowen.personinfo.mapper.ProductMapper;
import com.xiaowen.personinfo.service.IProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
