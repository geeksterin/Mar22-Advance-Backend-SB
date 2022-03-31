package in.geekster.springtutorial.helloworldapp.services.impls;

import in.geekster.springtutorial.helloworldapp.services.Printer;
import in.geekster.springtutorial.helloworldapp.services.RandomDataGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


@Slf4j
public class DefaultPrinter implements Printer {

    @Autowired
    private RandomDataGenerator randomDataGenerator;

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void printRandom() {
//        log.info("Printing Random: {}", random.nextInt());
//        final RandomDataGenerator randomDataGenerator =
//                applicationContext.getBean("randomDataGenerator", RandomDataGenerator.class);

        log.info("Printing Random: {}", randomDataGenerator.generateRandomNumber());
    }
}
