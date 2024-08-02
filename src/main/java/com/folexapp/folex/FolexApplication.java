package com.folexapp.folex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FolexApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolexApplication.class, args);
	}

}
