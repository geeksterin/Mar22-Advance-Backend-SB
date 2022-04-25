package in.geekster.springtutorial.geeksterinsurance.services.impls;

import in.geekster.springtutorial.geeksterinsurance.services.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("green")
@Slf4j
public class MobileTestService implements TestService {
    @Override
    public void printText(final String text) {
        log.info("Printing from Mobile Service: {}", text);
    }
}
