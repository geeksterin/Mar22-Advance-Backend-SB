package in.geekster.springtutorial.helloworldapp.configurations;

import in.geekster.springtutorial.helloworldapp.services.Printer;
import in.geekster.springtutorial.helloworldapp.services.RandomDataGenerator;
import in.geekster.springtutorial.helloworldapp.services.impls.DefaultPrinter;
import in.geekster.springtutorial.helloworldapp.services.impls.DefaultRandomDataGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
public class RegistrationConfiguration {

    @Bean
    public Printer printer() {
        return new DefaultPrinter();
    }
}
