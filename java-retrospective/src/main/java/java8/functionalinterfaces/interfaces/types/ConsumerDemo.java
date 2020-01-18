package java8.functionalinterfaces.interfaces.types;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        Consumer<String>  printLowerCase = str -> System.out.println(str.toLowerCase());

        printUpperCase.accept("text string");
        printLowerCase.accept("ANOTHER TEXT STRING");
    }
}
