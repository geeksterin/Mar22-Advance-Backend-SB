package in.geekster.springtutorial.geeksterinsurance.services.impls;

import in.geekster.springtutorial.geeksterinsurance.models.Nominee;
import in.geekster.springtutorial.geeksterinsurance.services.NomineeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DefaultNomineeService implements NomineeService {

    @Override
    public Nominee createNominee(final Long customerId, final Nominee nominee) {
        nominee.setCustomerId(customerId);
        return nominee;
    }
}
