package in.geekster.corefundamentals.couplingandprogrammingtointerface;

import java.util.ArrayList;
import java.util.List;

public interface MySort<T> {

    ArrayList<T> sortWithTightCoupling(final T[] objectArray);
    ArrayList<T> sortWithLooseCouplingPartial(final ArrayList<T> objectList);
    List<T> sortWithCompleteLooseCoupling(final List<T> objectList);
    default void doNothing() {
        // sjfhsjfhjsf
    }

}
