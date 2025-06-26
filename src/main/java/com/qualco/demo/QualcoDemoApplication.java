package com.qualco.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qualco.demo.mapper")
public class QualcoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(QualcoDemoApplication.class, args);
    }
}
