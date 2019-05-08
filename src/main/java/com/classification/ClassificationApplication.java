package com.classification;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.classification.mapper")
public class ClassificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClassificationApplication.class, args);
    }

}
