package com.maoyou.testseata.stock.controller;


import com.maoyou.testseata.stock.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author maoyou
 * @since 2023-07-27
 */
@RestController
@RequestMapping("/stock/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @RequestMapping("/deduct")
    public void deduct(@RequestParam int commodityCode, @RequestParam int count) {
        iProductService.deduct(commodityCode, count);
    }

    @RequestMapping("/getPriceByID")
    public BigDecimal getPriceByID(@RequestParam int commodityCode) {
        return iProductService.getPriceByID(commodityCode);
    }
}

