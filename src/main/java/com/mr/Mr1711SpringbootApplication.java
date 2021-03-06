package com.mr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.mr.mapper")
@EnableTransactionManagement
public class Mr1711SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mr1711SpringbootApplication.class, args);
	}
}
