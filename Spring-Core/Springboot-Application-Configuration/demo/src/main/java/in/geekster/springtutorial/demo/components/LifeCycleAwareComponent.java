package in.geekster.springtutorial.demo.components;

import in.geekster.springtutorial.demo.configurationproperties.CustomMessagesProperty;
import in.geekster.springtutorial.demo.services.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class LifeCycleAwareComponent {

    @Autowired
    private GreetingService greetingService;

    @Autowired
    private CustomMessagesProperty customMessagesProperty;

    @PostConstruct
    public void onStartUp() {
        log.info("Greeting Users on StartUp: {}", greetingService.generateGreetingMessage());
        log.info("Custom Messages: {}", customMessagesProperty);
    }
}
