package in.geekster.springtutorial.messageservice.dtos;

import in.geekster.springtutorial.messageservice.enums.LanguageCode;
import in.geekster.springtutorial.messageservice.enums.MessageType;
import lombok.Data;

@Data
public class MessageSearchRequest {
    private LanguageCode languageCode;
    private MessageType messageType;
    private String region;
}
