package java9.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class NullStream {
    public static void main(String[] args) {
        List<Integer> nullList = null;
        printData(nullList);

        Set<Integer> nullSet = null;
        printData(nullSet);
    }

    //Old way
    private static void printData(List<Integer> list) {
        System.out.println("Old way of null collection processing");
        if(list != null) {
            list.stream().forEach(System.out::println);
        }
    }

    //New way
    private static void printData(Set<Integer> set) {
        System.out.println("New way of null collection processing");
        Stream.ofNullable(set).forEach(System.out::println);
    }
}
