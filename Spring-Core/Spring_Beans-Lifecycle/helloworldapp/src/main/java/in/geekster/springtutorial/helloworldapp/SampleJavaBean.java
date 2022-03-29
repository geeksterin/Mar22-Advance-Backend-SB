package in.geekster.springtutorial.helloworldapp;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * This following annotation {@link Component} does two things
 * 1. It turns this simple Java object / bean into a Spring managed object or bean,
 * which means a life-cylce is attached to it
 *
 * 2. It registers itself with the Spring Container
 */
@Component
public class SampleJavaBean {

    private final String name;

    public SampleJavaBean() {
        name = "Sample App";
    }

    public String readName() {
        return name;
    }

    @PostConstruct
    public void init() {
        System.out.println("\n\n<><><> HEY THERE <><><>\n\n");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("\n\n<><><> GOODBYE <><><>\n\n");
    }
}
