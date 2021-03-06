package com.data.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.data.processor.BasicController;

@SpringBootApplication
//@ComponentScan(basePackageClasses = BasicController.class)
@ComponentScan(basePackages="com.data.processor,com.data.kafka.consumer,com.data.repositories,com.data.service,com.data.serviceImpl")
@EnableJpaRepositories("com.data.repositories")
@EntityScan("com.data.model")
public class SpringKafkaApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringKafkaApplication.class, args);
  }
  
//  @Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				//registry.addMapping("/**").allowedOrigins("http://192.168.8.102:9002");
//				  registry.addMapping("/**")
//	                .allowedMethods("GET", "POST");
//			}
//		};
//	}
}
