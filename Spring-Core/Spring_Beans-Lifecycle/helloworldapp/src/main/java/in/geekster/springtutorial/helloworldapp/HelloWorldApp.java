package in.geekster.springtutorial.helloworldapp;

import in.geekster.springtutorial.helloworldapp.services.Printer;
import in.geekster.springtutorial.helloworldapp.services.RandomDataGenerator;
import in.geekster.springtutorial.helloworldapp.services.impls.DefaultRandomDataGenerator;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Slf4j
public class HelloWorldApp implements InitializingBean, DisposableBean {

//    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldApp.class);

    @Autowired
    private RandomDataGenerator randomDataGenerator;

    @Autowired
    private Printer printer;

    @PostConstruct
    public void onStart() {
        log.info("{}", randomDataGenerator.generateRandomNumber());
        printer.printRandom();

    }

    @PreDestroy
    public void onClose() {
        log.info("{}", randomDataGenerator.generateRandomBoolean());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("skfhsjfsjfgsjf" + randomDataGenerator.generateRandomBoolean());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("skfhsjkfhsjhf" + randomDataGenerator.generateRandomNumber());
    }
}
