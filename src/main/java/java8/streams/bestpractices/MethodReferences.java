package java8.streams.bestpractices;

import java8.streams.bestpractices.data.TestData;

/**
 * Method references instead of lambdas
 */
public class MethodReferences {
    public static void main(String[] args) {

        //Avoid:
        TestData.stringListData().stream()
                .map(s -> s.length())
                .forEach(l -> System.out.println(l));

        //Preferable usage:
        TestData.stringListData().stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
