package com.maoyou.testseata.order.service.impl;

import com.maoyou.testseata.order.entity.Orders;
import com.maoyou.testseata.order.feign.PayFeign;
import com.maoyou.testseata.order.feign.StockFeign;
import com.maoyou.testseata.order.mapper.OrdersMapper;
import com.maoyou.testseata.order.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
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
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {
    @Autowired
    private PayFeign payFeign;
    @Autowired
    private StockFeign stockFeign;

    @Override
    @GlobalTransactional
    public Orders create(int userId, int commodityCode, int orderCount) {
        // 保存订单
        BigDecimal priceByID = stockFeign.getPriceByID(commodityCode);
        BigDecimal money = new BigDecimal(orderCount).multiply(priceByID);
        Orders orders = new Orders();
        orders.setUserId(userId);
        orders.setProductId(commodityCode);
        orders.setPayAmount(money);
        this.save(orders);
        // 减库存
        stockFeign.deduct(commodityCode, orderCount);
        // 扣余额
        payFeign.debit(userId, money);
        return orders;
    }

}
