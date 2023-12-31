package com.maoyou.testseata.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.maoyou.testseata.order.mapper")
public class TestSeataOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSeataOrderApplication.class, args);
    }

}
