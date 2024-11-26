package com.example.jerapi;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JerapiApplication extends ResourceConfig {

	public JerapiApplication() {
		register(MyResource.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JerapiApplication.class, args);
	}

}
