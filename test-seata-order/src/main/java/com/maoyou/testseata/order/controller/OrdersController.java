package com.maoyou.testseata.order.controller;


import com.maoyou.testseata.order.entity.Orders;
import com.maoyou.testseata.order.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author maoyou
 * @since 2023-07-27
 */
@RestController
@RequestMapping("/order/orders")
public class OrdersController {
    @Autowired
    private IOrdersService iOrdersService;

    @RequestMapping("create")
    public Orders create() {
        Orders orders = iOrdersService.create(1, 1, 1);
        return orders;
    }

}

