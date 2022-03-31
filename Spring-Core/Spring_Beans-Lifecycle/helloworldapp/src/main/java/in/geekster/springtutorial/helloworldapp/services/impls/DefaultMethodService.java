package in.geekster.springtutorial.helloworldapp.services.impls;

import in.geekster.springtutorial.helloworldapp.services.MethodService;
import in.geekster.springtutorial.helloworldapp.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultMethodService implements MethodService {

    private Printer printer;

    @Override
    public void doNothing() {

    }

    @Autowired
    public void setMethod(final Printer printer) {
        this.printer = printer;
    }
}
