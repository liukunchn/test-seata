package com.maoyou.testseata.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @ClassName PayFeign
 * @Description
 * @Author 刘坤 kunliu@yinhai.com
 * @Date 2023/7/27 23:05
 * @Version 1.0
 */
@FeignClient(value = "test-seata-pay")
public interface PayFeign {
    @RequestMapping("/pay/account/debit")
    void debit(@RequestParam int userId, @RequestParam BigDecimal money);
}
