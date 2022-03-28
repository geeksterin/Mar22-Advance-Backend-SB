package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        // Initializing with Array List
        final List<Integer> integerList = new ArrayList<>();

        // Adding to List
        integerList.add(2);
        integerList.add(3);

        // removal by index
        integerList.remove(1);

        System.out.println("List at this moment: " + integerList);
        System.out.println("Size of List: " + integerList.size());

        // Initializing with LinkedList
        final List<String> stringList1 = new LinkedList<>();
        stringList1.add("Hello");

        // Initializing a List with a Collection / List
        final List<String> stringList2 = new LinkedList<>(stringList1);
        stringList2.add("Hey");

        System.out.println("String List 1: " + stringList1);
        System.out.println("String List 2: " + stringList2);
    }
}
