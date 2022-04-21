package in.geekster.springtutorial.geeksterinsurance.exceptions;

public class InsurancePolicyNotFoundException extends RuntimeException {

    public InsurancePolicyNotFoundException(final String message) {
        super(message);
    }
}
