package functionalinterfaces;

/**
 * This is an example of Predicate Interface since it consumes data and
 * returns Boolean
 * @param <T>
 */

@FunctionalInterface
public interface Math<T extends Number> {

    boolean isPositive(final T num);
}
