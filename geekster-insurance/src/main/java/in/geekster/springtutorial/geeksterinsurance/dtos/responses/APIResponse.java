package in.geekster.springtutorial.geeksterinsurance.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponse<T> {
    private T data;
    private ErrorResponse error;

}
