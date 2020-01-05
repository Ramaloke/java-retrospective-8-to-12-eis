package java9.interfaces.privatemethod;

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
        return "[Name: " + (PrivateMethods.isValidName(getName()) ? getName() : "no name")
                + ", Surname: " + (PrivateMethods.isValidSurname(getSurname()) ? getSurname() : "no surname")
                + ", Age: " + getAge()
                + ", Lucky Number: " + getLuckyNumber()
                + "]";
    }
}
