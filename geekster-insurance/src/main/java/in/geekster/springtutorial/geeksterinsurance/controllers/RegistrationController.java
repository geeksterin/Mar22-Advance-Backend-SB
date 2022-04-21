package in.geekster.springtutorial.geeksterinsurance.controllers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.geekster.springtutorial.geeksterinsurance.dtos.requests.NomineeDTO;
import in.geekster.springtutorial.geeksterinsurance.dtos.requests.RegistrationRequest;
import in.geekster.springtutorial.geeksterinsurance.dtos.responses.RegisteredDTO;
import in.geekster.springtutorial.geeksterinsurance.exceptions.InsurancePolicyNotFoundException;
import in.geekster.springtutorial.geeksterinsurance.models.Customer;
import in.geekster.springtutorial.geeksterinsurance.models.Insurance;
import in.geekster.springtutorial.geeksterinsurance.models.Nominee;
import in.geekster.springtutorial.geeksterinsurance.models.Wallet;
import in.geekster.springtutorial.geeksterinsurance.services.CustomerService;
import in.geekster.springtutorial.geeksterinsurance.services.InsuranceService;
import in.geekster.springtutorial.geeksterinsurance.services.NomineeService;
import in.geekster.springtutorial.geeksterinsurance.services.WalletService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.Optional;

@RestController
@Slf4j
public class RegistrationController {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @PostConstruct
    private void init() {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Autowired
    private CustomerService customerService;

    @Autowired
    private NomineeService nomineeService;

    @Autowired
    private WalletService walletService;

    @Autowired
    private InsuranceService insuranceService;

    @PostMapping("signup")
    public ResponseEntity<RegisteredDTO> register(@Validated @RequestBody final RegistrationRequest registrationRequest) {

        log.info("Received Registration Request: {}", registrationRequest);

        // Extract Customer Information from Request and Pass it to Customer Service
        // Convert to Customer Model
        Customer customer = objectMapper.convertValue(registrationRequest, Customer.class);
        log.info("Converted to Customer Model: {}", customer);
        // Call Customer Service
        customer = customerService.createCustomer(customer);
        log.info("Created Customer: {}", customer);


        // Extract Customer Nominee info from request and pass it to Customer Nominee Service
        final NomineeDTO nomineeDTO = registrationRequest.getNominee();
        Nominee nominee = objectMapper.convertValue(nomineeDTO, Nominee.class);
        log.info("Created Nominee: {}", nominee);
        nominee = nomineeService.createNominee(customer.getId(), nominee);
        log.info("Created Nominee: {}", nominee);

        // Create Wallet and Add 100 Rs to it

        final Optional<Wallet> wallet = walletService.createWallet(customer.getId());
        log.info("Created Wallet: {}", wallet);
        walletService.addToWallet(wallet.get().getWalletId(), BigDecimal.valueOf(100));

        try {
            insuranceService.createInsurance(new Insurance());
        } catch (InsurancePolicyNotFoundException e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok(new RegisteredDTO());

    }
}
