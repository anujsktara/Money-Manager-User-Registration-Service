package com.ce.ur;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegserviceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(RegserviceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RegserviceApplication.class, args);
		LOGGER.info("***********insertMovie action called..");
		LOGGER.info("***********insertMovie action called..");
	}

}
