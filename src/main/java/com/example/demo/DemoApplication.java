package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//ComponentScan 可以指定扫描的包位置 不用放在跟application同一级别
@ComponentScan(value = "com")
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplicationBuilder builder=new SpringApplicationBuilder(DemoApplication.class);
		//builder.bannerMode(Banner.Mode.OFF).run(args);
		SpringApplication.run(DemoApplication.class, args);
	}
}
