package in.geekster.springtutorial.geeksterinsurance.services;

import in.geekster.springtutorial.geeksterinsurance.exceptions.InsurancePolicyDateException;
import in.geekster.springtutorial.geeksterinsurance.exceptions.InsurancePolicyNotFoundException;
import in.geekster.springtutorial.geeksterinsurance.models.Insurance;
import in.geekster.springtutorial.geeksterinsurance.models.InsurancePolicy;

import java.net.MalformedURLException;
import java.util.Optional;

public interface InsuranceService {


    // Insurance Policy
    InsurancePolicy createInsurancePolicy(final InsurancePolicy insurancePolicy);
    Optional<InsurancePolicy> getInsurancePolicyById(final Long insuranceId);

    // Insurance
    Insurance createInsurance(final Insurance insurance);
    Optional<Insurance> getInsuranceById(final Long insuranceId);
}
