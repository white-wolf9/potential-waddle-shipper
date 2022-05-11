package com.whitewolf09.shipper;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.whitewolf09.shipper")
@ComponentScan({"com.whitewolf09.shipper"})
@EntityScan("com.whitewolf09.shipper")
public class ShipperApplication {


	public static void main(String[] args) {


		SpringApplication.run(ShipperApplication.class, args);

	}



}
