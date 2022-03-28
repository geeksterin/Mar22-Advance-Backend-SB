package functionalinterfaces;

/**
 * This is an example of BiFunctional Interface since it consumes
 * two parameters and returns one
 * @param <T>
 * @param <E>
 * @param <R> -- return type
 */
@FunctionalInterface
public interface Concatenator2<T, E, R> {

    R concatenateAndReturn(final T data1, final T data2, final Class<R> clazz);


}
