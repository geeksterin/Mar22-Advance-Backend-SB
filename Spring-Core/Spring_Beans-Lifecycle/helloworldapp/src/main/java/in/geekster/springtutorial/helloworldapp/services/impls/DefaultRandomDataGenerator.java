package in.geekster.springtutorial.helloworldapp.services.impls;

import in.geekster.springtutorial.helloworldapp.services.RandomDataGenerator;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DefaultRandomDataGenerator implements RandomDataGenerator {

    private final Random random = new Random();

    @Override
    public Integer generateRandomNumber() {
        return random.nextInt();
    }

    @Override
    public Boolean generateRandomBoolean() {
        return random.nextBoolean();
    }
}
