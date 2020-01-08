package java9.util;

import java9.module.ModuleInterface;
import java9.module.internal.InternalModuleInterfaceImpl;

import java.text.MessageFormat;

public class UtilMain {
    public static void main(String[] args) throws Exception {
        ModuleInterface moduleInterface = new InternalModuleInterfaceImpl();
        System.out.println(MessageFormat.format("Name: {0}; age: {1}", moduleInterface.getName(), moduleInterface.getAge()));

        moduleInterface.callMethodByName(new UtilMain(), "privateMethod");
    }

    private void privateMethod() {
        System.out.println("'privateMethod' is called");
    }
}
