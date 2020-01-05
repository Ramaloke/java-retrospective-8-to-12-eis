package java8.interfaces.defaultmethod;

public class Main {

    public static void main(String[] args) {
        DefaultMethods methods = new DefaultMethodsImpl();
        methods.print("String value");
        System.out.println("methods.getName(): " + methods.getName());
        System.out.println("methods.getName(String): " + methods.getName("John Doe"));
    }
}
