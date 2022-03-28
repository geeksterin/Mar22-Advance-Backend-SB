package in.geekster.corefundamentals.couplingandprogrammingtointerface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        final MySort<String> mySort = new MySortImpl2<String>();

        final List<String> strings = new ArrayList<>();
        mySort.sortWithCompleteLooseCoupling(strings);
        mySort.doNothing();

        /**
         * Use
         */
    }
}
