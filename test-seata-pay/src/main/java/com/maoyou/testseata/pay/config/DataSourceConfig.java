package com.maoyou.testseata.pay.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @ClassName DataSourceConfig
 * @Description
 * @Author 刘坤 kunliu@yinhai.com
 * @Date 2023/7/23 18:30
 * @Version 1.0
 */
@Configuration
public class DataSourceConfig {

    @Bean("stock")
    public DataSource dataSourceMaster(DataSourceProperties dataSourceProperties) {
        DruidDataSource druidDataSource = dataSourceProperties
                .initializeDataSourceBuilder()
                .type(DruidDataSource.class)
                .build();
        return druidDataSource;
    }
}
