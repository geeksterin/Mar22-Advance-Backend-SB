package optionals;

import java.util.Optional;
import java.util.Random;

public class MockAPICall {

    private final static Random RANDOM = new Random();


    /**
     * The method below simulates an API call over the internet
     * which may or may not succeed.
     * Here the class {@link Random} has been used to randomly generate
     * a {@link Boolean} value.
     * For true, the method returns a String
     * For false, the method returns null
     * @return
     */
    public String unsafeAPICall() {
        if (RANDOM.nextBoolean()) {
            return "Response Call";
        } else {
            return null;
        }
    }

    /**
     * The method below demonstrates two uses of Optional
     * @return
     */
    public Optional<String> safeAPICall() {
        if (RANDOM.nextBoolean()) {
            return Optional.of("Response Call");
        } else {
            return Optional.empty();
        }
    }

    /**
     * The method below shows the use of Optional when the expected resule
     * may or may not be null
     * @return
     */
    public Optional<String> safeAPICallHandlingNull() {
        return Optional.ofNullable(unsafeAPICall());
    }
}
