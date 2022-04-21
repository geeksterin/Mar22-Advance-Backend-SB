package in.geekster.springtutorial.geeksterinsurance.dtos.responses;

import in.geekster.springtutorial.geeksterinsurance.enums.InsuranceStatus;
import lombok.Data;

@Data
public class InsuranceCreatedResponse {
    private Long id;
    private String name;
    private InsuranceStatus status;
    private String createdOn;
    private String expiredOn;
    private PolicyCreatedResponse policy;
}
