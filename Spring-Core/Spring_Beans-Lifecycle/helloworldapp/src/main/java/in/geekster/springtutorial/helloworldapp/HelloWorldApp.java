package in.geekster.springtutorial.helloworldapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HelloWorldApp {

    @Autowired
    private SampleJavaBean sampleJavaBean;


    @PostConstruct
    public void init() {
        System.out.println("Running Hello WOrld 2");
    }
}
