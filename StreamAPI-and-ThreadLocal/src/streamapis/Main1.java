package streamapis;


import java.util.*;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(10);
        list.add(13);
        list.add(53);
        list.add(55);
        list.add(56);
        list.add(0);

        System.out.printf("Before Operation: %s", list);

        final List<String> strList = new ArrayList<>();

        List<Integer> filteredList = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                filteredList.add(i);
            }
        }


        final Set<Integer> set = new HashSet<>(filteredList);

        for (Integer s : set) {
            strList.add("" + s);
        }



        final List<String> finalList =
                list
                        .stream()
                        .filter((val) -> (val % 2) == 0)
                        .distinct()
                        .map((val) -> "" + val)
                        .map((val) -> Integer.parseInt(val))
                        .map((val) -> val + 10)
                        .map((val) -> String.valueOf(val))
                        .collect(Collectors.toList());

        System.out.printf("\nAfter Operation: %s\n\n\n", finalList);

        final List<List<Integer>> l2 = new ArrayList<>();
        l2.add(Arrays.asList(1, 2, 3));
        l2.add(Arrays.asList(10, 10, 13));
        l2.add(Arrays.asList(11, 11, 32));
        l2.add(Arrays.asList(1, 200 ));

        System.out.println(l2);

        System.out.println(l2
                .stream()
                .flatMap((val) -> val.stream())
                .filter((val) -> (val % 2) == 0)
                .distinct()
                .map((val) -> "" + val)
                .collect(Collectors.toList()));


    }

}
