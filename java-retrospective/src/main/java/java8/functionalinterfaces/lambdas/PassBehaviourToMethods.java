package java8.functionalinterfaces.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PassBehaviourToMethods {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("First", "Second", "Third", "One", "Two", "Three");

        //strings with more than 3 symbols
        System.out.println(getStringsWithCondition(words, s -> s.length() > 3));

        //strings started with "T"
        System.out.println(getStringsWithCondition(words, s -> s.startsWith("T")));
    }

    public static List<String> getStringsWithCondition(List<String> data, Predicate<String> condition) {
        return data.stream().filter(condition).collect(Collectors.toList());
    }
}
