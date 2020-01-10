package java9.optional;

import java.util.List;
import java.util.Optional;

public class OptionalImprovements {
    public static void main(String[] args) {
        //ifPresentOrElse()
        ifPresentOrElseExample(Optional.empty());
        ifPresentOrElseExample(Optional.of("Test string"));

        //or()
        orExample();
        orChainExample();

        //stream()
        streamExample(Optional.of("Test"));
        streamExample(List.of(Optional.of(1), Optional.of(2), Optional.empty(), Optional.empty(), Optional.of(5)));
    }

    private static void ifPresentOrElseExample(Optional<String> value) {
        value.ifPresentOrElse(v -> System.out.println("Optional value: " + v),
                () -> System.out.println("Optional value: No value"));
    }

    private static void orExample() {
        Optional<String> ticket = buyTicketInAirport().or(() -> buyAnyAvailableTicket());
        System.out.println("or example: " + ticket);
    }

    private static void orChainExample() {
        Optional<String> ticket = buyTicketInAirport().or(
                () -> buyTicketFromDealer().or(
                        () -> buyAnyAvailableTicket()
                )
        );

        System.out.println("or chain example: " + ticket);
    }

    private static void streamExample(Optional<String> value) {
        value.stream().forEach(System.out::println);
    }

    private static void streamExample(List<Optional> optionalList) {
        System.out.println("List<Optional> processing:");
        optionalList.stream()
                .flatMap(Optional::stream)
                .forEach(System.out::println);
    }

    //Auxiliary methods
    private static Optional<String> buyTicketInAirport() {
        return Optional.empty();
    }

    private static Optional<String> buyTicketFromDealer() {
        return Optional.empty();
    }

    private static Optional<String> buyAnyAvailableTicket() {
        return Optional.of("Any available ticket");
    }
}
