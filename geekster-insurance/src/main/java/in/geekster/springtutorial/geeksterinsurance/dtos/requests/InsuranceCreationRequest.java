package in.geekster.springtutorial.geeksterinsurance.dtos.requests;

import in.geekster.springtutorial.geeksterinsurance.enums.InsuranceStatus;
import lombok.Data;

@Data
public class InsuranceCreationRequest {
    private String name;
    private InsuranceStatus status;
    private String createdOn;
    private String expiredOn;
    private Long policyId;
}
