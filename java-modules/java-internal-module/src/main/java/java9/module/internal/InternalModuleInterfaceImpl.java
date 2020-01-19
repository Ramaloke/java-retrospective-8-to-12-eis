package java9.module.internal;

import java9.module.ModuleInterface;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * Implementation of {@link ModuleInterface} as part of private API
 */
public class InternalModuleInterfaceImpl implements ModuleInterface {
    @Override
    public String getName() {
        return "Default name";
    }

    @Override
    public int getAge() {
        return new Random().nextInt(100);
    }

    public void callMethodByName(Object object, String methodName) throws Exception {
        //Reflexive access to private printMethod of InternalModuleInterfaceImpl.java
        Method method = object.getClass().getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(object);
    }
}
