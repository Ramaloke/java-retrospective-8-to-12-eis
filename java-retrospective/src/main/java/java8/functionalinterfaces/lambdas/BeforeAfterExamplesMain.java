package java8.functionalinterfaces.lambdas;

import java8.functionalinterfaces.data.Gender;
import java8.functionalinterfaces.data.Person;

import java.util.Arrays;
import java.util.List;

public class BeforeAfterExamplesMain {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John Doe", Gender.MALE),
                new Person("Melissa Dunne", Gender.FEMALE),
                new Person("Darin Vaz", Gender.MALE),
                new Person("Adella Mock", Gender.FEMALE)
        );
        System.out.println("Old way example:");
        System.out.println("Filter");
        BeforeLambdasMethods.printMalePeople(people);
        System.out.println("Sort");
        BeforeLambdasMethods.printSortedPeopleByName(people);

        System.out.println("\nNew way example:");
        System.out.println("Filter");
        LambdaWayMethods.printMalePeople(people);
        System.out.println("Sort");
        LambdaWayMethods.printSortedPeopleByName(people);
    }
}
