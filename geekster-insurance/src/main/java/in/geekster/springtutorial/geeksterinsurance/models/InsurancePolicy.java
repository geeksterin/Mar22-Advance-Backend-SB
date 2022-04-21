package in.geekster.springtutorial.geeksterinsurance.models;

import in.geekster.springtutorial.geeksterinsurance.enums.InsuranceType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class InsurancePolicy {
    private Long id;
    private Integer itemsCovered;
    private BigDecimal sumInsured;
    private InsuranceType type;
}
