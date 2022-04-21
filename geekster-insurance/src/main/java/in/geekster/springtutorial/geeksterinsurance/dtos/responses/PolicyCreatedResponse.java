package in.geekster.springtutorial.geeksterinsurance.dtos.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import in.geekster.springtutorial.geeksterinsurance.enums.InsuranceType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PolicyCreatedResponse {

    private Long id;

    @JsonProperty(value = "items_covered")
    private Integer itemsCovered;

    @JsonProperty(value = "max_sum_insured")
    private BigDecimal maxSumInsured;

    private InsuranceType type;
}
