package in.geekster.springtutorial.geeksterinsurance.controllers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.geekster.springtutorial.geeksterinsurance.dtos.requests.InsuranceCreationRequest;
import in.geekster.springtutorial.geeksterinsurance.dtos.responses.APIResponse;
import in.geekster.springtutorial.geeksterinsurance.dtos.responses.ErrorResponse;
import in.geekster.springtutorial.geeksterinsurance.dtos.responses.InsuranceCreatedResponse;
import in.geekster.springtutorial.geeksterinsurance.dtos.responses.PolicyCreatedResponse;
import in.geekster.springtutorial.geeksterinsurance.exceptions.InsurancePolicyDateException;
import in.geekster.springtutorial.geeksterinsurance.exceptions.InsurancePolicyNotFoundException;
import in.geekster.springtutorial.geeksterinsurance.models.Insurance;
import in.geekster.springtutorial.geeksterinsurance.models.InsurancePolicy;
import in.geekster.springtutorial.geeksterinsurance.services.InsuranceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Optional;

@RestController
@RequestMapping("insurances")
@Slf4j
public class InsuranceController {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private InsuranceService insuranceService;

    @PostConstruct
    private void init() {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
    // 123


    // delete 123

    //  create insurance with 123

    @PostMapping
    public ResponseEntity<APIResponse<InsuranceCreatedResponse>> createInsurance(@RequestBody final InsuranceCreationRequest request) {
        log.info("Received Insurance Creation Request: {}\n", request);

        if (true) {
            throw new InsurancePolicyNotFoundException("No Insurance Policy Found");
        }

        try {
            final Long policyId = request.getPolicyId();
            final Optional<InsurancePolicy> insurancePolicyOptional = insuranceService.getInsurancePolicyById(policyId);

            if (!insurancePolicyOptional.isPresent()) {
                log.warn("No Policy found by ID: {}", policyId);
                final String message = String.format("No such policy found for ID: %s", policyId);
                throw new InsurancePolicyNotFoundException(message);
            }

            final InsurancePolicy insurancePolicy = insurancePolicyOptional.get();
            final PolicyCreatedResponse policyCreatedResponse = objectMapper.convertValue(insurancePolicy, PolicyCreatedResponse.class);
            Insurance insurance = objectMapper.convertValue(request, Insurance.class);
            log.info("Converted Insurance: {}", insurance);
            insurance = insuranceService.createInsurance(insurance);
            final InsuranceCreatedResponse insuranceCreatedResponse = objectMapper.convertValue(insurance, InsuranceCreatedResponse.class);
            insuranceCreatedResponse.setPolicy(policyCreatedResponse);
            final APIResponse<InsuranceCreatedResponse> apiResponse = new APIResponse<>(insuranceCreatedResponse, null);
            return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);

        } catch (InsurancePolicyDateException e) {
            final ErrorResponse errorResponse = new ErrorResponse("ERR002", "Invalid Insurance Creation Date");
            final APIResponse<InsuranceCreatedResponse> apiResponse = new APIResponse<>(null, errorResponse);
            return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);
        }
    }
}
