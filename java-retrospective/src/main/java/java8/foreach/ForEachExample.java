package java8.foreach;

import java.util.Iterator;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);

        System.out.println("Test data: " + numbers);
        System.out.println("=======");
        oldWayIterator(numbers);
        System.out.println("=======");
        newWayIterator(numbers);
        System.out.println("=======");
        consumerNewWayIterator(numbers);
    }

    public static void oldWayIterator(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("Old iterator value: " + value);
        }
    }

    public static void newWayIterator(List<Integer> list) {
        list.forEach(v -> System.out.println("Java 8 forEach value: " + v));
    }

    public static void consumerNewWayIterator(List<Integer> list) {
        list.forEach(new PlusOneConsumer());
    }
}
