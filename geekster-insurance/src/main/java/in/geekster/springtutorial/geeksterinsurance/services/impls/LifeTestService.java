package in.geekster.springtutorial.geeksterinsurance.services.impls;

import in.geekster.springtutorial.geeksterinsurance.services.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("red")
public class LifeTestService implements TestService {
    @Override
    public void printText(final String text) {
        log.info("Printing from Life Service: {}", text);
    }
}
