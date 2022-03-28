package generics;

public class PrinterUtil {

    /**
     * This is a normal class with Generic method
     */
    public <T> void print(final T data) {
        System.out.println("Printing from Generic Method: " + data);
    }
}
