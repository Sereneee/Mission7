package com.example.Mission7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
public class Mission7Application {
	public static void main(String[] args)
	{
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "");
//		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "prod");
//		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "test");
		SpringApplication.run(Mission7Application.class, args);
	}
}
