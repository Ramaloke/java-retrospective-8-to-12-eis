package java8.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExamples {
    public static void main(String[] args) {
        //Reference to a static method
        getNamesList().sort((n1, n2) -> MethodReferenceExamples.compareNames(n1, n2));
        getNamesList().sort(MethodReferenceExamples::compareNames);

        //Reference to an instance method of a particular object
        StringComparator comparator = new StringComparator();
        getNamesList().sort((n1, n2) -> comparator.compareStrings(n1, n2));
        getNamesList().sort(comparator::compareStrings);

        //Reference to an instance of an arbitrary object of a particular type
        getNamesList().sort((n1, n2) -> n1.compareToIgnoreCase(n2));
        getNamesList().sort(String::compareToIgnoreCase);

        //Reference to a constructor
        ArrayList<String> filteredByJ = getNamesList().stream()
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println("Filtered by first letter 'J': " + filteredByJ);

        List<String> filteredByM = getNamesList().stream()
                .filter(s -> s.startsWith("M"))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Filtered by first letter 'M': " + filteredByM);
    }

    private static List<String> getNamesList() {
        return Arrays.asList("John", "Melissa", "Valdemar", "Monika");
    }

    private static int compareNames(String name1, String name2) {
        return name1.compareTo(name2);
    }
}
