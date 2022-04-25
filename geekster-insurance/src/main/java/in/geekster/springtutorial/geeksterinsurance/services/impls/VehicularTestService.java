package in.geekster.springtutorial.geeksterinsurance.services.impls;

import in.geekster.springtutorial.geeksterinsurance.services.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Slf4j
@Service("blue")
@Primary
public class VehicularTestService implements TestService {

    @Override
    public void printText(final String text) {
        log.info("Printing from Vehicular Test Service: {}", text);
    }
}
