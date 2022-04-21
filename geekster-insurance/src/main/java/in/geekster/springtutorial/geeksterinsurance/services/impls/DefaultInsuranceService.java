package in.geekster.springtutorial.geeksterinsurance.services.impls;

import in.geekster.springtutorial.geeksterinsurance.exceptions.DuplicateInsurancePolicyException;
import in.geekster.springtutorial.geeksterinsurance.exceptions.InsurancePolicyDateException;
import in.geekster.springtutorial.geeksterinsurance.exceptions.InsurancePolicyNotFoundException;
import in.geekster.springtutorial.geeksterinsurance.models.Insurance;
import in.geekster.springtutorial.geeksterinsurance.models.InsurancePolicy;
import in.geekster.springtutorial.geeksterinsurance.services.InsuranceService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefaultInsuranceService implements InsuranceService {

    @Override
    public InsurancePolicy createInsurancePolicy(InsurancePolicy insurancePolicy) {
        if (doesInsurancePolicyAlreadyExist(insurancePolicy)) {
            throw new DuplicateInsurancePolicyException("Policy already exists");
        }
        return null;
    }

    @Override
    public Optional<InsurancePolicy> getInsurancePolicyById(Long insuranceId) {
        return Optional.empty();
    }

    @Override
    public Insurance createInsurance(Insurance insurance) {
        final Long insurancePolicyId = insurance.getPolicyId();
        final Optional<InsurancePolicy> insurancePolicyOptional = getInsurancePolicyById(insurancePolicyId);
        if (!insurancePolicyOptional.isPresent()) {
            throw new InsurancePolicyNotFoundException("No Insurance Policy Found by ID: " + insurancePolicyId);
        }

        if (isCreationDateInThePast(insurance.getCreatedOn())) {
            throw new InsurancePolicyDateException();
        }
        return new Insurance();
    }

    @Override
    public Optional<Insurance> getInsuranceById(Long insuranceId) {
        return Optional.empty();
    }

    private boolean isCreationDateInThePast(final String creationDate) {
        return true;
    }

    private boolean doesInsurancePolicyAlreadyExist(final InsurancePolicy policy) {
        return true;
    }
}
