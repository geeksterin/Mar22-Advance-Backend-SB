package in.geekster.springtutorial.geeksterinsurance.exceptions;

public class DuplicateInsurancePolicyException extends RuntimeException {

    public DuplicateInsurancePolicyException(final String message) {
        super(message);
    }
}
