package in.geekster.springtutorial.geeksterinsurance;

import in.geekster.springtutorial.geeksterinsurance.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class GeeksterInsuranceApplication {

	@Autowired
	@Qualifier("red")
	private TestService testService;

	public static void main(String[] args) {
		SpringApplication.run(GeeksterInsuranceApplication.class, args);
	}

	@PostConstruct
	private void runTestService() {
		testService.printText("Hey There!!");
	}

}
