package com.maoyou.testseata.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @ClassName StockFeign
 * @Description
 * @Author 刘坤 kunliu@yinhai.com
 * @Date 2023/7/27 23:15
 * @Version 1.0
 */
@FeignClient(value = "test-seata-stock")
public interface StockFeign {
    @RequestMapping("/stock/product/deduct")
    void deduct(@RequestParam int commodityCode, @RequestParam int count);

    @RequestMapping("/stock/product/getPriceByID")
    BigDecimal getPriceByID(@RequestParam int commodityCode);
}
