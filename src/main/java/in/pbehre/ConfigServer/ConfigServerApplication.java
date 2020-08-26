/**
 * ConfigServerApplication
 * Copyright (C) 2018 - 2019 Tata Consultancy Services Limited
 * Author: Pavitra Behre <behre.p1@tcs.com>
 * </ TCS LICENSE>
 */
package in.pbehre.ConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud Config Server Implementation
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
