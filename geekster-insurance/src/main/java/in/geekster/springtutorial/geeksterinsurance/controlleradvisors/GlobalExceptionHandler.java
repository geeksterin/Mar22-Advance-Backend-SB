package in.geekster.springtutorial.geeksterinsurance.controlleradvisors;

import in.geekster.springtutorial.geeksterinsurance.dtos.responses.APIResponse;
import in.geekster.springtutorial.geeksterinsurance.dtos.responses.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<APIResponse<Void>> handleGlobalException(final Exception e) {
        log.error("Handling Global Exception:\n", e);
        final ErrorResponse errorResponse = new ErrorResponse("G00000", "Oops!! Something went wrong. Please try again");
        final APIResponse<Void> apiResponse = new APIResponse<>(null, errorResponse);
        return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
