package java8.functionalinterfaces.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LazyEvaluationExample {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());

        System.out.println("Old way: " + sumOddNumbersWithinRange5to15(numbers));
        System.out.println("Lambda way: " + sumOddNumbersWithinRange5to15Lambda(numbers));
        System.out.println("Lambda + method references: " + sumOddNumbersWithinRange5to15Refactored(numbers));

        System.out.println("=======");
        System.out.println("Lazy evaluation call order");
        lazyEvaluationCallOrder();
    }

    //Old way
    private static int sumOddNumbersWithinRange5to15(List<Integer> numbers) {
        int result = 0;
        for (Integer num : numbers) {
            if(num % 2 != 0 && num > 4 && num < 16) {
                result += num;
            }
        }

        return result;
    }

    //Lambda way
    private static int sumOddNumbersWithinRange5to15Lambda(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 != 0)
                .filter(num -> num > 4)
                .filter(num -> num < 16)
                .mapToInt(i -> i)
                .sum();
    }

    //Lambda refactored
    private static int sumOddNumbersWithinRange5to15Refactored(List<Integer> numbers) {
        return numbers.stream()
                .filter(LazyEvaluationExample::isOdd)
                .filter(LazyEvaluationExample::isGreaterThan4)
                .filter(LazyEvaluationExample::isLessThan16)
                .mapToInt(i -> i)
                .sum();
    }

    private static void imperativeWayCallOrder() {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        int result = 0;
        for (Integer i : integers) {
            if(i%2 == 0) {
                result += i;
            }
        }
        System.out.println("Result: " + result);
    }

    private static void lazyEvaluationCallOrder() {
        IntStream intStream = IntStream.of(1, 2, 3);
        intStream = intStream
                .peek(i -> System.out.println("Before filter value: " + i))
                .filter(i -> {
                    System.out.println("i%2 == 0");
                    return i%2 == 0;
                })
                .peek(i -> System.out.println("After filter value: " + i));

        System.out.println("Call sum() terminal operation.");
        System.out.println("Result: "  + intStream.sum());
    }

    private static boolean isOdd(int i) {
        return i%2 != 0;
    }

    private static boolean isGreaterThan4(int i) {
        return i > 4;
    }

    private static boolean isLessThan16(int i) {
        return i < 16;
    }
}
