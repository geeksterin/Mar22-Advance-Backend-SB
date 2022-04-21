package in.geekster.springtutorial.geeksterinsurance.models;

import in.geekster.springtutorial.geeksterinsurance.enums.InsuranceStatus;
import lombok.Data;

@Data
public class Insurance {
    private Long id;
    private String name;
    private InsuranceStatus status;
    private String createdOn; // 18-04-2022 --> 17-04-2022
    private String expiredOn;
    private Long policyId;
}
