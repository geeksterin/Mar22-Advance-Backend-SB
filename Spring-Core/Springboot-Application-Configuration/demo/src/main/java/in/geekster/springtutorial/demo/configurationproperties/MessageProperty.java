package in.geekster.springtutorial.demo.configurationproperties;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(value = "messages")
@Getter
@Setter
public class MessageProperty {
//    private String greet;
    private List<String> welcome;
}
