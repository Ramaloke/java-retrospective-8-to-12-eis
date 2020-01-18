package java8.functionalinterfaces.interfaces.sam;

public class FunctionalFooMain {
    public static void main(String[] args) {
        //Old way
        FunctionalFoo oldFoo = new FunctionalFoo() {
            @Override
            public void foo() {
                System.out.println("Old way of foo() implementation");
            }
        };
        oldFoo.foo();

        //Lambda way
        FunctionalFoo foo = () -> System.out.println("Lambda way of foo() implementation");
        foo.foo();
    }
}
