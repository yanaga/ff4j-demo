package com.redhat;

import com.redhat.recommendation.DefaultRecommendationEngine;
import com.redhat.recommendation.ImprovedRecommendationEngine;
import org.ff4j.FF4j;
import org.ff4j.web.FF4jDispatcherServlet;
import org.ff4j.web.embedded.ConsoleServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@ComponentScan({"org.ff4j.aop", "com.redhat"})
@SpringBootApplication
public class Ff4jDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ff4jDemoApplication.class, args);
	}

	@Bean
	public FF4j ff4j() {
		return new FF4j("ff4j.xml");
	}

	@Bean
	public ServletRegistrationBean ff4jServlet(FF4j ff4j) {
		FF4jDispatcherServlet ff4jServlet = new FF4jDispatcherServlet();
		ff4jServlet.setFf4j(ff4j);
		return new ServletRegistrationBean(ff4jServlet, "/ff4j-console/*");
	}

	@Primary
	@Bean
	public DefaultRecommendationEngine defaultRecommendationEngine() {
		return new DefaultRecommendationEngine();
	}

	@Bean
	public ImprovedRecommendationEngine improvedRecommendationEngine() {
		return new ImprovedRecommendationEngine();
	}
}
