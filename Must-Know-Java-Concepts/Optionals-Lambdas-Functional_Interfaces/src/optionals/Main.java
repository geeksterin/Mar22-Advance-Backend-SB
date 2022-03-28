package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        final MockAPICall mockAPICall = new MockAPICall();
        final String unsafeResponse = mockAPICall.unsafeAPICall();
        System.out.println("Unsafe Call: " + unsafeResponse.toLowerCase());

        final Optional<String> responseOptional = mockAPICall.safeAPICallHandlingNull();
        if (responseOptional.isPresent()) {
            System.out.println("Safe API call: Response Present: " + responseOptional.get());
        } else {
            System.err.println("Safe API call: Response Not Present");
        }
    }
}
