package java9.factorymethods;

import java.util.*;

public class PreJava9CollectionCreation {
    public static void main(String[] args) {
        //Unmodifiable list
        List<String> list = Arrays.asList("A", "B", "B", "C");
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable list: " + unmodifiableList);

        //Unmodifiable set
        Set<String> set = new HashSet<>(list);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(set);
        System.out.println("Unmodifiable set: " + unmodifiableSet);

        //Unmodifiable map
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(map);
        System.out.println("Unmodifiable map: " + unmodifiableMap);
    }
}
