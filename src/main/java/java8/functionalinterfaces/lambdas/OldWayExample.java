package java8.functionalinterfaces.lambdas;

import java8.functionalinterfaces.data.Gender;
import java8.functionalinterfaces.data.Person;

import java.util.*;

public class OldWayExample {
    public static void printMalePeople(List<Person> people) {
        List<Person> malePeople = new ArrayList<>();
        for (Person p : people) {
            if(p.getGender() == Gender.MALE) {
                malePeople.add(p);
            }
        }

        for (Person p : malePeople) {
            System.out.println(p);
        }
    }

    public static void printSortedPeopleByName(List<Person> people) {
        List<Person> sortedPeopleByName = new ArrayList<>(people);
        Collections.sort(sortedPeopleByName, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        for (Person p : sortedPeopleByName) {
            System.out.println(p);
        }
    }
}
