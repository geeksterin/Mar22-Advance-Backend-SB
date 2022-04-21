package in.geekster.springtutorial.geeksterinsurance.models;

import in.geekster.springtutorial.geeksterinsurance.enums.Gender;
import in.geekster.springtutorial.geeksterinsurance.enums.Relationship;
import lombok.Data;

@Data
public class Nominee {
    private Long customerId;
    private String name;
    private String dob;
    private Gender gender;
    private Relationship relationship;
}
