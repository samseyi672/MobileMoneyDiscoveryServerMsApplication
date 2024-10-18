package com.fintect.MobileMoneyDiscoveryServerMs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MobileMoneyDiscoveryServerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileMoneyDiscoveryServerMsApplication.class, args);
	}

}
