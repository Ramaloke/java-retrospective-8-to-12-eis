package java8.interfaces.defaultmethod.diamondproblem;

public class FlyingCarEngine implements AircraftEngine, CarEngine{
    @Override
    public void nitro() {
        System.out.println("FlyingCarEngine nitro()");
    }
}
