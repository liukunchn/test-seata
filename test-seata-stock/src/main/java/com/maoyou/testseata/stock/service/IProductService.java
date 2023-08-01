package com.maoyou.testseata.stock.service;

import com.maoyou.testseata.stock.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author maoyou
 * @since 2023-07-27
 */
public interface IProductService extends IService<Product> {
    /**
     * 扣除存储数量
     */
    void deduct(int commodityCode, int count);

    BigDecimal getPriceByID(int commodityCode);
}
