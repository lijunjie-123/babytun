package com.itlaoqi.babytun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itlaoqi.babytun") //mybatis在SpringBoot启动的时候自动扫描mybatis实现的接口
public class BabytunApplication {
	public static void main(String[] args) {
		SpringApplication.run(BabytunApplication.class, args);
	}
}
