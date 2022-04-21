package in.geekster.springtutorial.geeksterinsurance.dtos.requests;

import in.geekster.springtutorial.geeksterinsurance.enums.Gender;
import in.geekster.springtutorial.geeksterinsurance.enums.Relationship;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class NomineeDTO {

    @NotNull(message = "Nominee Name cannot be null")
    @NotEmpty(message = "Nominee Name cannot be empty")
    @NotBlank(message = "Nominee Name cannot be blank")
    private String name;

    @NotNull(message = "Nominee DOB cannot be null")
    private String dob;

    @NotNull(message = "Nominee Gender cannot be null")
    private Gender gender;

    @NotNull(message = "Nominee Relationship cannot be null")
    private Relationship relationship;
}
