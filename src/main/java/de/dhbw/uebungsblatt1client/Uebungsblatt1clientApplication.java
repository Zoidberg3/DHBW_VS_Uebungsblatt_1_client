package de.dhbw.uebungsblatt1client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Uebungsblatt1clientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Uebungsblatt1clientApplication.class, args);
	}

}
