package java8.functionalinterfaces.lambdas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());

        System.out.println(sumOddNumbersWithinRange5to15(numbers));
    }

    //Old way
    public static int sumOddNumbersWithinRange5to15(List<Integer> numbers) {
        int result = 0;
        for (Integer num : numbers) {
            if(num % 2 != 0 && num > 4 && num < 16) {
                result += num;
            }
        }

        return result;
    }

    //Lambda way
    /*public static int sumOddNumbersWithinRange5to15(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 != 0)
                .filter(num -> num > 4)
                .filter(num -> num < 16)
                .mapToInt(i -> i)
                .sum();
    }*/

    //Lambda refactored
    /*public static int sumOddNumbersWithinRange5to15(List<Integer> numbers) {
        return numbers.stream()
                .filter(LazyEvaluation::isOdd)
                .filter(LazyEvaluation::isGreaterThan4)
                .filter(LazyEvaluation::isLessThan16)
                .mapToInt(i -> i)
                .sum();
    }*/

    public static boolean isOdd(int i) {
        return i%2 != 0;
    }

    public static boolean isGreaterThan4(int i) {
        return i > 4;
    }

    public static boolean isLessThan16(int i) {
        return i < 16;
    }
}
