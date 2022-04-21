package in.geekster.springtutorial.geeksterinsurance.controlleradvisors;

import in.geekster.springtutorial.geeksterinsurance.controllers.InsuranceController;
import in.geekster.springtutorial.geeksterinsurance.controllers.RegistrationController;
import in.geekster.springtutorial.geeksterinsurance.dtos.responses.APIResponse;
import in.geekster.springtutorial.geeksterinsurance.dtos.responses.ErrorResponse;
import in.geekster.springtutorial.geeksterinsurance.exceptions.InsurancePolicyNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice(assignableTypes = {InsuranceController.class, RegistrationController.class})
public class InsuranceExceptionsHandler {

    @ExceptionHandler(value = {InsurancePolicyNotFoundException.class})
    public ResponseEntity<APIResponse<Void>> handleInsurancePolicyNotFoundException(final InsurancePolicyNotFoundException e) {
        log.error("Handling Insurance Exceptions:\n", e);
        final ErrorResponse errorResponse = new ErrorResponse("ERR001", e.getMessage());
        final APIResponse<Void> apiResponse = new APIResponse<>(null, errorResponse);
        return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);
    }
}
