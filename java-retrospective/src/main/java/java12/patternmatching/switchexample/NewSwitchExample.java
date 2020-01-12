package java12.patternmatching.switchexample;

import java.time.Month;

import static java.time.Month.*;

public class NewSwitchExample {
    public static void main(String[] args) {
        monthsSwitchExpressionWay(JANUARY);

        monthsSwitchStatementWay(JUNE);
    }

    //Java 12 expression way
    //Uncomment method body if you use JDK 12 and preview feature is enabled
    private static void monthsSwitchExpressionWay(Month month) {
        /*String result = switch(month) {
            case DECEMBER, JANUARY, FEBRUARY -> "Winter";
            case MARCH, APRIL, MAY -> "Spring";
            case JUNE, JULY, AUGUST -> "Summer";
            case SEPTEMBER, OCTOBER, NOVEMBER -> "Autumn";
            default -> "WTF?";
        };

        System.out.println("Current season is " + result);*/
    }

    //Java 12 statement way
    //Uncomment method body if you use JDK 12 and preview feature is enabled
    private static void monthsSwitchStatementWay(Month month) {
        /*String result = switch (month) {
            case DECEMBER, JANUARY, FEBRUARY:
                break "Winter";
            case MARCH, APRIL, MAY:
                break "Spring";
            case JUNE, JULY, AUGUST:
                break "Summer";
            case SEPTEMBER, OCTOBER, NOVEMBER:
                break "Autumn";
            default:
                break "WTF?";
        };

        System.out.println("Current season is " + result);*/
    }
}
