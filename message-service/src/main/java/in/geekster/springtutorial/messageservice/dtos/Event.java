package in.geekster.springtutorial.messageservice.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class Event {

    @JsonProperty(value = "name")
    @NotEmpty
    @NotBlank
    private String eventName;
}
