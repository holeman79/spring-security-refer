package com.example.demospringsecurityoauth2session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class DemoSpringSecurityOauth2SessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringSecurityOauth2SessionApplication.class, args);
	}

}
