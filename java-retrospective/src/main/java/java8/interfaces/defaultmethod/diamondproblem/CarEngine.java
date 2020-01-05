package java8.interfaces.defaultmethod.diamondproblem;

public interface CarEngine {
    default void nitro() {
        System.out.println("CarEngine nitro()");
    };
}
