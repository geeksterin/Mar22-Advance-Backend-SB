package collections;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        final Set<Integer> uniqueSet = new HashSet<>();
        uniqueSet.add(100);
        uniqueSet.add(1);
        uniqueSet.add(2);
        uniqueSet.add(1); // Will give warning because duplicate elements are not added in HashSet
        uniqueSet.add(5);
        uniqueSet.add(3);
        uniqueSet.add(10);

        System.out.println("HashSet: " + uniqueSet);

        // Initializing TreeSet with Collection / Set
        final Set<Integer> orderedSet = new TreeSet<>(uniqueSet);
        System.out.println("TreeSet: " + orderedSet);


        // Initializing a LinkedHashSet to preserve insertion order
        final Set<Integer> insertOrderedSet = new LinkedHashSet<>();
        insertOrderedSet.add(100);
        insertOrderedSet.add(10);
        insertOrderedSet.add(1);
        insertOrderedSet.add(30);
        insertOrderedSet.add(55);
        System.out.println("LinkedHashSet: " + insertOrderedSet);


    }
}
