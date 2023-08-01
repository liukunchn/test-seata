package com.maoyou.testseata.order.service;

import com.maoyou.testseata.order.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author maoyou
 * @since 2023-07-27
 */
public interface IOrdersService extends IService<Orders> {
    /**
     * 创建订单
     */
    Orders create(int userId, int commodityCode, int orderCount);

}
