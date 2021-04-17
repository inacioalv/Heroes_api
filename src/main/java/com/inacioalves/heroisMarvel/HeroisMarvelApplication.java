package com.inacioalves.heroisMarvel;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class HeroisMarvelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroisMarvelApplication.class, args);
		System.out.println("Super poderes com webflux");
	
		}

}
