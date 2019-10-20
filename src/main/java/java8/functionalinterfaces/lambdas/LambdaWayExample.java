package java8.functionalinterfaces.lambdas;

import java8.functionalinterfaces.data.Gender;
import java8.functionalinterfaces.data.Person;

import java.util.List;

public class LambdaWayExample {
    public static void printMalePeople(List<Person> people) {
        people.stream()
                .filter(p -> p.getSex().equals(Gender.MALE))
                .forEach(p -> System.out.println(p));
    }

    public static void printSortedPeopleByName(List<Person> people) {
        people.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(System.out::println);
    }
}
