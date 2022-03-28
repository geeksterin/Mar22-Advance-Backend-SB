package functionalinterfaces;

/**
 * This is an example of Functional Interface since it consumes and returns
 * @param <T>
 * @param <R>
 */
@FunctionalInterface
public interface Adder<T extends Number, R extends Number> {

    R add(T num1, T num2);
}
