package java9.interfaces.privatemethod;

import java.util.Random;

public interface PrivateMethods {
    default String getName() {
        return "Default name";
    }

    default String getSurname() {
        return "Default surname";
    };

    default int getAge() {
        return randomIntInRange(1, 99);
    }

    default int getLuckyNumber() {
        return randomIntInRange(0, 10000);
    }

    //generate int from min to max
    private int randomIntInRange(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    };

    static boolean isValidName(String name) {
        return isEmpty(name);
    }

    static boolean isValidSurname(String surname) {
        return isEmpty(surname);
    }

    private static boolean isEmpty(String value) {
        return value != null && !value.isEmpty();
    }
}
