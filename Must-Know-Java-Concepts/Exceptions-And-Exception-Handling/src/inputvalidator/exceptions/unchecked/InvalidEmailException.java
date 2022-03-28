package inputvalidator.exceptions.unchecked;

/**
 * This class here is an example of Unchecked or Runtime Exception
 * Unchecked Exceptions are exceptions that goes undetected by the compiler
 * at compile time and only occurs at the time the program is running, hence
 * the name runtime exception
 *
 * Any class extending {@link RuntimeException} directly or indirectly via
 * a subclass of {@link RuntimeException} will be recognized as a Unchecked or
 * Runtime Exception
 */
public class InvalidEmailException extends RuntimeException {

    /**
     * This is the constructor for this custom exception class which internally
     * calls the super method with its argument
     * @param message -- the message that is passed to its constructor at the time
     *                of throwing the exception. This message needs to be passed to
     *                super in order for it to show up in the stacktrace
     */
    public InvalidEmailException(final String message) {
        super(message);
    }
}
