package java11.var;

import java.util.stream.Stream;

public class VarInLambdasExample {
    public static void main(String[] args) {
        //Valid
        Stream.of(1, 2, 3).forEach(val -> System.out.println(val));

        //Invalid
//        Stream.of(1, 2, 3).forEach(final val -> System.out.println(val));
//        Stream.of(1, 2, 3).forEach(final val -> System.out.println(val));
//        Stream.of(1, 2, 3).forEach((final val) -> System.out.println(val));

        //Valid
        Stream.of(1, 2, 3).forEach((final Integer val) -> System.out.println(val));
        Stream.of(1, 2, 3).forEach((final var val) -> System.out.println(val));
    }
}
