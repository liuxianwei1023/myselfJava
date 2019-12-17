package com.lxw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan()
@SpringBootApplication
public class GitApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitApplication.class, args);
        System.out.println("第一次做修改");
        System.out.println("这个是dev的修改");
        System.out.println("dev Or master?");
        System.out.println("这个应该是master");
        System.out.println("这个是dev的修改");
        System.out.println("dev Or master?");
    }
}
