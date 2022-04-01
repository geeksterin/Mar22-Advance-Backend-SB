package in.geekster.springtutorial.demo.configurationproperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties("custom-messages")
@Getter
@Setter
@ToString
public class CustomMessagesProperty {
    private String msg1;
    private String msg2;
    private Map<String, String> msg;
}
