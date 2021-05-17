package com.PWS.MongoDB.SpringbootMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import com.github.cloudyrock.spring.v5.EnableMongock;

@SpringBootApplication
@EnableMongock// force maven to download the jars
public class SpringBootMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDbApplication.class, args);
	}

}
