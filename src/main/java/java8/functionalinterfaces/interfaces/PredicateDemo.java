package java8.functionalinterfaces.interfaces;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isOdd = i -> i%2 != 0;

        System.out.println("Is 3 odd? - " + isOdd.test(3));
        System.out.println("Is 6 odd? - " + isOdd.test(6));
    }
}
