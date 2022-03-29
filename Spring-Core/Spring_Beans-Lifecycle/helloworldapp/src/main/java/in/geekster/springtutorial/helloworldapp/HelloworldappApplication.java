package in.geekster.springtutorial.helloworldapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@SpringBootApplication
public class HelloworldappApplication {

	@Autowired
	private SampleJavaBean bean;

	public static void main(String[] args) {
		SpringApplication.run(HelloworldappApplication.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println(bean.readName());
	}


	@PreDestroy
	public void destroy() {
		System.out.println("\n\n<><><> GOODBYE 2 <><><>\n\n");
	}
}
