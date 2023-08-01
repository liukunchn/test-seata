package com.maoyou.testseata.pay.controller;


import com.maoyou.testseata.pay.service.IAccountService;
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
@RequestMapping("/pay/account")
public class AccountController {
    @Autowired
    private IAccountService iAccountService;

    @RequestMapping("/debit")
    public void debit(@RequestParam int userId, @RequestParam BigDecimal money) {
        iAccountService.debit(userId, money);
    }

}

