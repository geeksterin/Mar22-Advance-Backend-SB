package in.geekster.springtutorial.geeksterinsurance.services.impls;

import in.geekster.springtutorial.geeksterinsurance.models.Customer;
import in.geekster.springtutorial.geeksterinsurance.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DefaultCustomerService implements CustomerService {

    @Override
    public Customer createCustomer(final Customer customer) {
        customer.setId(1L);
        return customer;
    }
}
