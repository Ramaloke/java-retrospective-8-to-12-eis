package java8.functionalinterfaces.interfaces.types;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> randomInt = () -> (int) (Math.random() * 1000);

        System.out.println(randomInt.get());
    }
}
