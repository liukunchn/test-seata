package com.maoyou.testseata.pay.service.impl;

import com.maoyou.testseata.pay.entity.Account;
import com.maoyou.testseata.pay.mapper.AccountMapper;
import com.maoyou.testseata.pay.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

    @Override
    @Transactional
    public void debit(int userId, BigDecimal money) {
        Account byId = getById(userId);
        Account update = new Account();
        update.setId(userId);
        update.setBalance(byId.getBalance().subtract(money));
        int i = 1 / 0;
        this.updateById(update);
    }
}
