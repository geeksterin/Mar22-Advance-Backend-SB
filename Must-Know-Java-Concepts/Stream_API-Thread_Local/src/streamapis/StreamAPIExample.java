package streamapis;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIExample {

    public static void main(String[] args) {

        /**
         * Given the below integer array, find all numbers divisible by 2, unique and return
         * a list of {@link String}
         */

        final Integer[] intArr = { 1, 2, 5, 12, 6, 5, 12, 13, 56, 54, 56, 8 };

        /**
         * Pre Lambda way of doing
         */
        final List<Integer> l1 = new ArrayList<>();
        for (Integer integer : intArr) {
            if (integer % 2 == 0) {
                l1.add(integer);
            }
        }

        final Set<Integer> uniqueSet = new HashSet<>();
        for (Integer integer : l1) {
            uniqueSet.add(integer);
        }

        final List<String> strList = new ArrayList<>();
        for (Integer integer : uniqueSet) {
            strList.add("" + integer);
        }


        /**
         * Lambda way of doing things
         */
        final List<Integer> integerList = new ArrayList<>(Arrays.asList(intArr));
        System.out.println("Integer List: " + integerList);
        final List<String> stringList =
                integerList
                        .stream()
                        .filter((i) -> ((i % 2) == 0))
                        .distinct()
                        .map((i) -> String.valueOf(i))
                        .collect(Collectors.toList());
        System.out.println("String List: " + stringList);

    }
}
