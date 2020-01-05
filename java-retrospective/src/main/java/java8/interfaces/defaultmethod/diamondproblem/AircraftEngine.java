package java8.interfaces.defaultmethod.diamondproblem;

public interface AircraftEngine {
    default void nitro() {
        System.out.println("AircraftEngine nitro()");
    };
}
