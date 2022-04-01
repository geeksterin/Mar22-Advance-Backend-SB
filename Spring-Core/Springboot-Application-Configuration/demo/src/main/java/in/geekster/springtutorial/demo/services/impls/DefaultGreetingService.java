package in.geekster.springtutorial.demo.services.impls;

import in.geekster.springtutorial.demo.configurationproperties.MessageProperty;
import in.geekster.springtutorial.demo.services.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class DefaultGreetingService implements GreetingService {

//    @Value("${messages.greet}")
//    private String greetMessage;

    @Autowired
    private MessageProperty messageProperty;


    @Override
    public String generateGreetingMessage() {
//        log.info("Returning Greeting Message: {}", messageProperty.getGreet());
        log.info("Returning Greeting Message Welcome: {}", messageProperty.getWelcome());
//        return greetMessage.get(0);
        return messageProperty.getWelcome().get(0);
    }
}
