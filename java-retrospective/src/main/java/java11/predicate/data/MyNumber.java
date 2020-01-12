package java11.predicate.data;

public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isOddNumber() {
        return number%2 != 0;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
