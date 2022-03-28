package in.geekster.corefundamentals.couplingandprogrammingtointerface;

import java.util.ArrayList;
import java.util.List;

public class MySortImpl2<T> implements MySortImproved<T> {

    @Override
    public ArrayList<T> sortWithTightCoupling(T[] objectArray) {
        return null;
    }

    @Override
    public ArrayList<T> sortWithLooseCouplingPartial(ArrayList<T> objectList) {
        return null;
    }

    @Override
    public List<T> sortWithCompleteLooseCoupling(List<T> objectList) {
        return null;
    }

    @Override
    public void doNothing() {

    }
}
