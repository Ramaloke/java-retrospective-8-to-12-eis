package java8.interfaces.defaultmethod.diamondproblem;

public class DiamondProblemMain {
    public static void main(String[] args) {
        AircraftEngine engine1 = new FlyingCarEngine();
        CarEngine engine2 = new FlyingCarEngine();

        engine1.nitro();
        engine2.nitro();
    }
}
