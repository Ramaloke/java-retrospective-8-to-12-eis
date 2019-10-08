package java8.interfaces.staticmethod;

public interface StaticMethods {
    static void printString(String value) {
        System.out.println("Static method prints: " + value);
    }

    /*static boolean equals(Object obj) {
        return true;
    }

    static int hashCode() {
        return 1;
    }*/
}
