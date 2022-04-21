package in.geekster.springtutorial.geeksterinsurance.controllers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.geekster.springtutorial.geeksterinsurance.dtos.requests.PolicyCreationRequest;
import in.geekster.springtutorial.geeksterinsurance.dtos.responses.PolicyCreatedResponse;
import in.geekster.springtutorial.geeksterinsurance.exceptions.DuplicateInsurancePolicyException;
import in.geekster.springtutorial.geeksterinsurance.exceptions.InsurancePolicyNotFoundException;
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

@RestController
@RequestMapping("policies")
@Slf4j
public class PolicyController {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @PostConstruct
    private void init() {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Autowired
    private InsuranceService insuranceService;

    @PostMapping
    public ResponseEntity<PolicyCreatedResponse> createPolicy(@RequestBody final PolicyCreationRequest policyCreationRequest) {

        if (true) {
            throw new InsurancePolicyNotFoundException("No Insurance Policy Found");
        }

        try {
            log.info("Received Policy Creation REq: {}", policyCreationRequest);
            final InsurancePolicy insurancePolicy = objectMapper.convertValue(policyCreationRequest, InsurancePolicy.class);
            final InsurancePolicy createdPolicy = insuranceService.createInsurancePolicy(insurancePolicy);
            log.info("Created Policy: {}", createdPolicy);
            final PolicyCreatedResponse policyCreatedResponse = objectMapper.convertValue(createdPolicy, PolicyCreatedResponse.class);
            return new ResponseEntity<>(policyCreatedResponse, HttpStatus.CREATED);
        } catch (DuplicateInsurancePolicyException e) {
            log.error("Duplicate Policy", e);
            return new ResponseEntity<>(null, HttpStatus.CONFLICT);
        }
    }




}
