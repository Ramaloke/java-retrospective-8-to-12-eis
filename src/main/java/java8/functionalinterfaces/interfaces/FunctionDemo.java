package java8.functionalinterfaces.interfaces;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> func = i -> String.valueOf(i);

        System.out.println(func.apply(777).getClass());
    }
}
