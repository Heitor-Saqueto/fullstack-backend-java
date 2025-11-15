//package com.myfullstackproject.demo.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfig implements WebMvcConfigurer{
//
//	@Override
//	public void addCorsMappings (CorsRegistry registry) {
//		//Allows requests from your front (5173)
//		registry.addMapping("/api/**") //Maps all endpoints with /api/
//		.allowedOrigins("http://localhost:5173") // Where you front is running
//		.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")// Allows all CRUD requisitions
//		.allowedHeaders("*")// Allows all headers
//		.allowCredentials(true);
//	}
//}
