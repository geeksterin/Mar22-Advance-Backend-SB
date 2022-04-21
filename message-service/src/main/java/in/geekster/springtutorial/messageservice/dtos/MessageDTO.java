package in.geekster.springtutorial.messageservice.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import in.geekster.springtutorial.messageservice.enums.LanguageCode;
import in.geekster.springtutorial.messageservice.enums.MessageType;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Valid
public class MessageDTO {

    @JsonProperty(value = "lang-code")
    @NotNull(message = "language-code cannot be null")
    private LanguageCode languageCode;

    @NotNull(message = "message cannot be null")
    @NotEmpty(message = "message cannot be empty")
    @NotBlank(message = "message cannot be blank")
    private String message;

    @NotNull(message = "message-type cannot be null")
    @JsonProperty(value = "message-type")
    private MessageType messageType;

    @NotEmpty(message = "region cannot be empty")
    @NotBlank(message = "region cannot be blank")
    private String region = "India";

    @Valid
    private Event event;
}
