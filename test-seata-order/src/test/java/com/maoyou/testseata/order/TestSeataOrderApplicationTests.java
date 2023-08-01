package com.maoyou.testseata.order;

import com.maoyou.testseata.order.entity.Orders;
import com.maoyou.testseata.order.service.IOrdersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestSeataOrderApplicationTests {
    @Autowired
    private IOrdersService iOrdersService;

    @Test
    void contextLoads() {
    }

    @Test
    void testDB() {
        Orders byId = iOrdersService.getById(1);
        System.out.println(byId);
    }

}
