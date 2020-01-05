package java9.interfaces.privatemethod;

public class Main {
    public static void main(String[] args) {
        PrivateMethods instance1 = new PrivateMethodsImpl("John", "");
        System.out.println(instance1);

        PrivateMethods instance2 = new PrivateMethodsImpl("", "Doe");
        System.out.println(instance2);

        PrivateMethods instance3 = new PrivateMethodsImpl();
        System.out.println(instance3);
    }
}
