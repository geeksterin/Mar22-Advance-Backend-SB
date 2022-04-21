package in.geekster.springtutorial.geeksterinsurance.dtos.requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import in.geekster.springtutorial.geeksterinsurance.enums.Gender;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class RegistrationRequest {

    @NotNull(message = "Name cannot be null")
    @NotEmpty(message = "Name cannot be empty")
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotNull(message = "DOB cannot be null")
    private String dob;

    @NotNull(message = "Gender cannot be null")
    private Gender gender;

    @NotNull(message = "Policy ID cannot be null")
    @NotEmpty(message = "Policy ID cannot be empty")
    @NotBlank(message = "Policy ID cannot be blank")
    @JsonProperty(value = "insurance_id")
    private String insuranceId;

    @Valid
    private NomineeDTO nominee;
}
