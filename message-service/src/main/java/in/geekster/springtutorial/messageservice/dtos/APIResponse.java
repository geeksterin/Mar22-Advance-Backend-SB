package in.geekster.springtutorial.messageservice.dtos;

import in.geekster.springtutorial.messageservice.enums.Status;
import lombok.Data;

@Data
public class APIResponse {

    private Status status;
    private String message;

}
