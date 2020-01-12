package java13.patternmatching.switchexample;

import java.time.Month;

import static java.time.Month.JUNE;

public class SwitchYieldExample {
    public static void main(String[] args) {
        monthsSwitchYield(JUNE);
    }

    //Java 13, yield example
    //Uncomment method body if you use JDK 13 and experimental feature is enabled
    private static void monthsSwitchYield(Month month) {
        /*String result = switch (month) {
            case DECEMBER, JANUARY, FEBRUARY:
                yield "Winter";
            case MARCH, APRIL, MAY:
                yield "Spring";
            case JUNE, JULY, AUGUST:
                yield "Summer";
            case SEPTEMBER, OCTOBER, NOVEMBER:
                yield "Autumn";
            default:
                yield "WTF?";
        };

        System.out.println("Current season is " + result);*/
    }
}