package java12.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TeeingCollectorExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        var result = integers.stream()
                .collect(Collectors.teeing(
                        //first Collector
                        Collectors.filtering(i -> (i%2 == 0), Collectors.toList()),

                        //second Collector
                        Collectors.filtering(i -> (i%3 == 0), Collectors.toList()),

                        //merger
                        (list1, list2) -> List.of(list1, list2)

                ));

        System.out.println("Multiples of 2: " + result.get(0));
        System.out.println("Multiples of 3: " + result.get(1));
    }
}
