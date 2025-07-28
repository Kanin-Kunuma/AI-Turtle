package com.zcom.zcomturtle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zcom.zcomturtle.mapper")
public class ZComTurtleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZComTurtleApplication.class, args);
    }

}
