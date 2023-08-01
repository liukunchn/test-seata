package com.maoyou.testseata.stock.service.impl;

import com.maoyou.testseata.stock.entity.Product;
import com.maoyou.testseata.stock.mapper.ProductMapper;
import com.maoyou.testseata.stock.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author maoyou
 * @since 2023-07-27
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Override
    @Transactional
    public void deduct(int commodityCode, int count) {
        Product byId = getById(commodityCode);
        Product update = new Product();
        update.setId(commodityCode);
        update.setStock(byId.getStock() - count);
        this.updateById(update);
    }

    @Override
    public BigDecimal getPriceByID(int commodityCode) {
        Product byId = this.getById(commodityCode);
        return byId.getPrice();
    }
}
