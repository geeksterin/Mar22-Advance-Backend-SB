package in.geekster.springtutorial.geeksterinsurance.dtos.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import in.geekster.springtutorial.geeksterinsurance.enums.RequestStatus;
import lombok.Data;

@Data
public class RegisteredDTO {

    private RequestStatus status;

    @JsonProperty(value = "policy_number")
    private String policyNumber;
}
