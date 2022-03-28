package inputvalidator.exceptions.checked;

/**
 * This class here is an example of Checked or Compile-time Exception
 * Checked Exceptions are exceptions that are detected by the compiler
 * at compile time, hence the name
 *
 * Any class extending {@link Exception} directly or indirectly via
 * a subclass of {@link Exception} will be recognized as a Checked or
 * Compile-time Exception
 */
public class InvalidInputException extends Exception {

    /**
     * This is the constructor for this custom exception class which internally
     * calls the super method with its argument
     * @param message -- the message that is passed to its constructor at the time
     *                of throwing the exception. This message needs to be passed to
     *                super in order for it to show up in the stacktrace
     */
    public InvalidInputException(final String message) {
        super(message);
    }
}
