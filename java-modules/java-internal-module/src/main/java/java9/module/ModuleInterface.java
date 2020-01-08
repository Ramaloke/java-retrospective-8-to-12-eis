package java9.module;

/**
 * Public API interface
 */
public interface ModuleInterface {
    String getName();
    int getAge();
    default void callMethodByName(Object object, String methodName) throws Exception {
        System.out.println("Default implementation of method");
    }
}
