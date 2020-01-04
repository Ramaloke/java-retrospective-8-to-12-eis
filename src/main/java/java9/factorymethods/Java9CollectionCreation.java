package java9.factorymethods;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class Java9CollectionCreation {
    public static void main(String[] args) {
        //Immutable list
        List<String> immutableList = List.of("A", "B", "C");
        System.out.println("Immutable list: " + immutableList);

        //Immutable set
        Set<String> immutableSet = Set.of("A", "B", "C");
        System.out.println("Immutable set: " + immutableSet);

        //Immutable map up to 10 key:pair values
        Map<String, Integer> immutableMap = Map.of("0", 0, "1", 1);
        System.out.println("Immutable map: " + immutableMap);

        //Immutable map for more than 10 key:pair values
        Map<String, Integer> immutableMapFromEntries = Map.ofEntries(entry("0", 0), entry("1", 1), entry("2", 2));
        System.out.println("Immutable map from Map.Entries: " + immutableMapFromEntries);
    }
}
