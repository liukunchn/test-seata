package com.maoyou.testseata.pay.service;

import com.maoyou.testseata.pay.entity.Account;
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
public interface IAccountService extends IService<Account> {
    /**
     * 从用户账户中借出
     */
    void debit(int userId, BigDecimal money);

}
