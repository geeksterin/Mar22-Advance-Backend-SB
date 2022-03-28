package functionalinterfaces;

/**
 * This is an example of BiConsumer since it only consumes two parameters
 * but does not produce / return anything
 * @param <T>
 * @param <E>
 */
@FunctionalInterface
public interface Concatenator1<T, E> {

    void concatenateNameAndPrint(T data1, E data2);

}
