package freedomphones.phonedb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PhonedbApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonedbApplication.class, args);
	}
}
