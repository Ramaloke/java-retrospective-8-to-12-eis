package java9.interfaces.privatemethod;

import static java9.interfaces.privatemethod.PrivateMethods.*;

public class PrivateMethodsImpl implements PrivateMethods {
   private String name;

   private String surname;

    public PrivateMethodsImpl() {
    }

    public PrivateMethodsImpl(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "[Name: " + (isValidName(getName()) ? getName() : "no name")
                + ", Surname: " + (isValidSurname(getSurname()) ? getSurname() : "no surname")
                + ", Age: " + getAge()
                + ", Lucky Number: " + getLuckyNumber()
                + "]";
    }
}
