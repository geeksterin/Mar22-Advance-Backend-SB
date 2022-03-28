package functionalinterfaces;

/**
 * Below function is an example of Consumer Functional Interface
 * since it only consumes and does not return
 * @param <T>
 */

@FunctionalInterface
public interface Printer<T> {

    void print(T data);
}
