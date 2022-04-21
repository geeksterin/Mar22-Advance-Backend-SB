package in.geekster.springtutorial.demo.services.impls;

import in.geekster.springtutorial.demo.services.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service("bean2")
public class Def2 implements GreetingService {


    @Override
    public String generateGreetingMessage() {
        return null;
    }
}
