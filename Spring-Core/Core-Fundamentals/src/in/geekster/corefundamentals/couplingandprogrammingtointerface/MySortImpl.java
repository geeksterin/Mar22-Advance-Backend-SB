package in.geekster.corefundamentals.couplingandprogrammingtointerface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySortImpl<T> implements MySort<T> {

    /**
     * This method demonstrates tight coupling because it creates as well as uses
     * @param objectArray
     * @return
     */
    @Override
    public ArrayList<T> sortWithTightCoupling(T[] objectArray) {

        // Creation phase
        final ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(objectArray));

        // Usage phase
        /**
         * Your sorting logic goes here
         */
        return arrayList;
    }

    /**
     * This method demonstrates partial loose coupling because it uses, but tightly couples the
     * signature of the method to a particular implementation
     * @param objectList
     * @return
     */
    @Override
    public ArrayList<T> sortWithLooseCouplingPartial(final ArrayList<T> objectList) {

        // Gives up creation
        // Uses the list

        return objectList;
    }

    /**
     * Complete loose coupling because it gives up creation as well as programs to interface
     * @param objectList
     * @return
     */
    @Override
    public List<T> sortWithCompleteLooseCoupling(List<T> objectList) {
        return null;
    }
}
