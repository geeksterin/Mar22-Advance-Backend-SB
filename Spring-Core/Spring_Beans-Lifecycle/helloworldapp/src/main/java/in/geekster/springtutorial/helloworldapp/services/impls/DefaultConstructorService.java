package in.geekster.springtutorial.helloworldapp.services.impls;

import in.geekster.springtutorial.helloworldapp.services.ConstructorService;
import in.geekster.springtutorial.helloworldapp.services.RandomDataGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DefaultConstructorService implements ConstructorService {


    private final RandomDataGenerator randomDataGenerator;

    @Autowired
    public DefaultConstructorService(final RandomDataGenerator randomDataGenerator) {
        this.randomDataGenerator = randomDataGenerator;
    }

    @Override
    public void doNothing() {
        log.info("{}", randomDataGenerator.generateRandomBoolean());
    }
}
