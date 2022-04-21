package in.geekster.springtutorial.geeksterinsurance.models;

import in.geekster.springtutorial.geeksterinsurance.enums.Gender;
import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String name;
    private String dob;
    private Gender gender;
    private String status;
}
