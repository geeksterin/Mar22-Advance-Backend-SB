package in.geekster.springtutorial.messageservice.dtos;

import in.geekster.springtutorial.messageservice.enums.MessageType;
import lombok.Data;

@Data
public class UpdateMessageDTO {
    private String message;
    private MessageType messageType;
}
