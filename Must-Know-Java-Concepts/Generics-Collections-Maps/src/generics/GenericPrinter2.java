package generics;

/**
 * This is a Generic class with two generic parameters
 * @param <T>
 * @param <V>
 */
public class GenericPrinter2<T, V> {

    public void printing(final T data1, final V data2) {
        System.out.println("Printing Data 1: " + data1);
        System.out.println("Printing Data 2: " + data2);
    }
}
