package java8.functionalinterfaces.interfaces;

@FunctionalInterface
public interface FunctionalFoo {
    void foo();

    //Compilation error
//    void bar();

    static void foobar() {
        System.out.println("Foobar");
    }

    default void foobarDefault() {
        System.out.println("Default Foobar");
    }
}
