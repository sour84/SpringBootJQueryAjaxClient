package com.javasampleapproach.jqueryajax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

@ComponentScan(basePackages = "com.javasampleapproach.jqueryajax")
@EnableJpaRepositories(basePackages = "com.javasampleapproach.jqueryajax.repository")
@EnableTransactionManagement
public class SpringBootJQueryAjaxClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJQueryAjaxClientApplication.class, args);
	}
}
