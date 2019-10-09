package church.allmembers.ChurchAllMembers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ChurchAllMembersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChurchAllMembersApplication.class, args);
	}

}
