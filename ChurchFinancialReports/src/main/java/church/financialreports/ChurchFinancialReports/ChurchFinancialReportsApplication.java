package church.financialreports.ChurchFinancialReports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ChurchFinancialReportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChurchFinancialReportsApplication.class, args);
	}

}
