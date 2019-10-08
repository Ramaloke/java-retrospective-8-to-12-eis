package java8.interfaces.defaultmethod;

public interface DefaultMethods {

    default void print(String value) {
        System.out.println("Default implementation: " + value);
    };

    default String getName() {
        return "Default name";
    }

    default String getName(String name) {
        return name;
    }

/*    default int hashCode() {
        return 1;
    };

    default boolean equals(Object obj) {
        return this.equals(obj);
    };*/
}
