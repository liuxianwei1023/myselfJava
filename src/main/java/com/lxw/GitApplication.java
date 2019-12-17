package com.lxw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan()
@SpringBootApplication
public class GitApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitApplication.class, args);
    }
}
