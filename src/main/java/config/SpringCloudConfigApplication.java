package config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Bus Refresh Endpoint:
 * /bus/refresh?destination=customers:**
 * Where destination is the application ID composed by [spring.application.name]:[active profile]:[server.port]
 */
@SpringCloudApplication
@EnableConfigServer
public class SpringCloudConfigApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SpringCloudConfigApplication.class, args);
	}

}
