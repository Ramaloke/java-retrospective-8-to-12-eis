package java8.foreach;

import java.util.function.Consumer;

public class PlusOneConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println("PlusOneConsumer: " + (integer + 1));
    }
}
