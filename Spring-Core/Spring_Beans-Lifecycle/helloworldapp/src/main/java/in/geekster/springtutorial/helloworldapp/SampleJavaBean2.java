package in.geekster.springtutorial.helloworldapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class SampleJavaBean2 implements InitializingBean, DisposableBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("STARTING");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("ENDING");
    }
}
