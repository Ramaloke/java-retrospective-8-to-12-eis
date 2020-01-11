package java10.typeinference;

import java.math.BigDecimal;

public class VarExample {
    public static void main(String[] args) {
        //Before Java 10
        BigDecimal bigDecimal = new BigDecimal("100");

        //Since Java 10 (local variable type inference)
        var decimal = new BigDecimal("100");
        System.out.println("decimal type: " + decimal.getClass());
    }
}
