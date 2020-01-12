package java11.predicate;

import java11.predicate.data.MyNumber;

import java.util.Arrays;
import java.util.List;

import static java.util.function.Predicate.not;
import static java.util.stream.Collectors.*;

public class PredicateNotExample {
    public static void main(String[] args) {
        List<MyNumber> myNumbers = Arrays.asList(
                new MyNumber(1),
                new MyNumber(2),
                new MyNumber(3),
                new MyNumber(4),
                new MyNumber(5)
        );

        List<MyNumber> oddNumbers = myNumbers.stream()
                .filter(MyNumber::isOddNumber)
                .collect(toList());
        System.out.println("Filter using method reference [even numbers]: " + oddNumbers);

        //Negation before Java 11
        List<MyNumber> evenNumbers = myNumbers.stream()
                .filter(num -> !num.isOddNumber())
                .collect(toList());
        System.out.println("Filter with negated method using '!' [odd numbers]: " + evenNumbers);

        //Negation since Java 11
        List<MyNumber> notOddNumbers = myNumbers.stream()
                .filter(not(MyNumber::isOddNumber))
                .collect(toList());
        System.out.println("Filter with Predicate.not() usage [odd numbers]: " + notOddNumbers);
    }
}
