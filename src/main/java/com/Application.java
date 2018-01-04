package com;

import org.mybatis.spring.annotation.MapperScan;
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@RestController
@MapperScan("com.dao")
@EnableEurekaClient
@EnableAutoConfiguration//(exclude={MapperScannerConfigurer.class})
//@SpringBootApplication
@ComponentScan
public class Application implements EmbeddedServletContainerCustomizer{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer arg0) {
//		arg0.setPort(9000);
	}

}
