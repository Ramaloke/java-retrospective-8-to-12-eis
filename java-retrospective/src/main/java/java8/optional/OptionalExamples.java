package java8.optional;

import java8.optional.data.Person;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class OptionalExamples {
    public static void main(String[] args) {
        //Optional.of()
        optionalOf("Test string");

        //Optional.ofNullable()
        optionalOfNullable(null);

        //Optional.empty()
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println("Optional.empty(): " + emptyOptional);

        //Optional.get()
        optionalGet("Test string");

        //Optional.isPresent()
        optionalIsPresent("Test string");

        //Optional.ifPresent()
        optionalIfPresent("Test string");

        //Optional.orElse()
        optionalOrElse("Test string");

        //Optional.orElseGet()
        optionalOrElseGet("Test string");

        //Optional.map()
        optionalMap("Test string");

        //Optional.flatMap()
        optionalFlatMap(42);
        anotherOptionalFlatMap(List.of(new Person(null, 20)));
    }

    private static void optionalOf(String value) {
        Optional<String> optional = Optional.of(value);
        System.out.println("Optional.of(value): " + optional);

//        Optional<Object> nullOptional = Optional.of(null);
//        System.out.println(nullOptional);
    }

    private static void optionalOfNullable(String value) {
        Optional<String> nullOptional = Optional.ofNullable(value);
        System.out.println("Optional.ofNullable(value): " + nullOptional);
    }

    private static void optionalGet(String value) {
        Optional<String> optional = Optional.of(value);
        System.out.println("Optional.of(value) - get(): " + optional.get());

        Optional<String> optionalOfNullable = Optional.ofNullable(null);
//        System.out.println("Optional.ofNullable(null) - get(): " + optionalOfNullable.get());
    }

    private static void optionalIsPresent(String value) {
        Optional<String> optional = Optional.of(value);
        if(optional.isPresent()) {
            System.out.println("Optional.isPresent() - true: " + optional.get());
        }

        Optional<Object> emptyOptional = Optional.empty();
        if(emptyOptional.isPresent()) {
            System.out.println("Optional.isPresent() - false: " + emptyOptional.get());
        }
    }

    private static void optionalIfPresent(String value) {
        Optional<String> optional = Optional.of(value);
        optional.ifPresent(val -> System.out.println("Optional.ifPresent(value) - true: " + val));

        Optional<Object> emptyOptional = Optional.empty();
        emptyOptional.ifPresent((val -> System.out.println("Optional.ifPresent(value) - false: " + val)));
    }

    private static void optionalOrElse(String value) {
        Optional<String> optional = Optional.ofNullable(value);
        System.out.println("Optional.orElse() - with value: " + optional.orElse("no value"));

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println("Optional.orElse() - no value: " + emptyOptional.orElse("no value"));
    }

    private static void optionalOrElseGet(String value) {
        Optional<String> optional = Optional.ofNullable(value);
        System.out.println("Optional.orElseGet() - with value: " + optional.orElseGet(() -> "no value"));

        Optional<Object> empty = Optional.empty();
        System.out.println("Optional.orElseGet() - no value: " + empty.orElseGet(() -> "no value"));
    }

    private static void optionalMap(String value) {
        Optional<String> optional = Optional.of(value);
        System.out.println("Optional.map() - toUpperCase: " + optional.map(String::toUpperCase));

        Optional<String> empty = Optional.empty();
        System.out.println("Optional.map() - no value: " + empty.map(String::toUpperCase));
    }

    private static void optionalFlatMap(Integer value) {
        Optional<Optional<Integer>> optionalOfOptional = Optional.of(Optional.ofNullable(value));
        Optional<String> optional = optionalOfOptional.flatMap(opt -> opt.map(String::valueOf));
        System.out.println("Optional.flatMap -> map: " + optional);

        Optional<Optional<Integer>> emptyOptionalOfOptional = Optional.of(Optional.empty());
        Optional<String> emptyOptional = emptyOptionalOfOptional.flatMap(opt -> opt.map(String::valueOf));
        System.out.println("Empty Optional.flatMap -> map: " + emptyOptional);
    }

    private static void anotherOptionalFlatMap(List<Person> list) {
        Optional<String> NPE = list.stream()
                .map(Person::getName)
                .findFirst(); //NPE

        String noNPE = list.stream()
                .map(Person::getName)
                .map(Optional::ofNullable)
                .findFirst()
                .flatMap(Function.identity())
                .orElse("no name");
    }
}
