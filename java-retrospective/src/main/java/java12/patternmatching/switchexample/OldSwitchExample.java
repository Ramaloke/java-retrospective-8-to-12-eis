package java12.patternmatching.switchexample;

import java.time.Month;

import static java.time.Month.*;

public class OldSwitchExample {

    public static void main(String[] args) {
        monthsSwitch(JANUARY);
    }

    private static void monthsSwitch(Month month) {
        String result = "";

        switch(month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                result = "Winter";
                break;
            case MARCH:
            case APRIL:
            case MAY:
                result = "Spring";
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                result = "Summer";
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                result = "Autumn";
                break;
            default:
                result = "WTF?";
        }

        System.out.println("Current season is " + result);
    }
}
