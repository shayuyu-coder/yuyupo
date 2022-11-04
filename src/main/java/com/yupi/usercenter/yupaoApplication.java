package com.yupi.usercenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yupi.usercenter.mapper")
public class yupaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(yupaoApplication.class, args);
    }

}
