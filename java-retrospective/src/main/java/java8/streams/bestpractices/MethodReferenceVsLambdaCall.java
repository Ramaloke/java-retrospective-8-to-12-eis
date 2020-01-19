package java8.streams.bestpractices;

import java.util.List;

/**
 * Compile and take a look at byte code of:
 *  - lambdaCall() - uses lambdas
 *  - methodReferenceCall() - uses method references instead of lambdas
 *
 *  To compile:
 *      javac MethodReferenceVsLambdaCall.java
 *  To view bytecode:
 *      javap -p -c MethodReferenceVsLambdaCall.class
 */
public class MethodReferenceVsLambdaCall {

    private static void lambdaCall(List<String> list) {
        list.stream()
                .map(s -> s.length())
                .forEach(item -> System.out.println(item));
    }

    private static void methodReferenceCall(List<String> list) {
        list.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
