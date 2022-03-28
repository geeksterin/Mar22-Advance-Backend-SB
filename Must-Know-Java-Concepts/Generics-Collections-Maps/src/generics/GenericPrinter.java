package generics;

/**
 * This is an example of Generic Class
 * @param <T> -- the type that will be determined dynamically at runtime
 */
public class GenericPrinter<T> {

    public void print(final T data) {
        System.out.println("Printing: " + data);
    }
}
