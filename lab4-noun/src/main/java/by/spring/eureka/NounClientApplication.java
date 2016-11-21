package by.spring.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NounClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NounClientApplication.class, args);
	}
}
