package in.geekster.springtutorial.geeksterinsurance.services;

import in.geekster.springtutorial.geeksterinsurance.models.Nominee;

public interface NomineeService {
    Nominee createNominee(final Long customerId, final Nominee nominee);
}
