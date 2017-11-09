package com.kgcx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kgcx.*.mapper.*")
@SpringBootApplication
public class KgcxOpcApplication {

	public static void main(String[] args) {
		SpringApplication.run(KgcxOpcApplication.class, args);
	}
}
