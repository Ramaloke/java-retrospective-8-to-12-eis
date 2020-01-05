package java8.dateapi;

import java.time.*;

public class DateCreationExamples {
    public static void main(String[] args) {
        //LocalDate
        LocalDate currentLocalDate = LocalDate.now();
        System.out.println("Current local date: " + currentLocalDate);

        LocalDate january2020FirstDay = LocalDate.of(2020, Month.JANUARY, 1);
        System.out.println("The 1st of January: " + january2020FirstDay);

        //LocalTime
        LocalTime currentLocalTime = LocalTime.now();
        System.out.println("Current time: " + currentLocalTime);

        LocalTime lunchTime = LocalTime.of(13, 30, 0, 42);
        System.out.println("Lunch time: " + lunchTime);

        //LocalDateTime
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current local date time: " + currentDateTime);

        LocalDateTime currentDateTimeArguments = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Current date time using LocalDate and LocalTime: " + currentDateTimeArguments);

        LocalDateTime january2020FirstDay_LunchTime = LocalDateTime.of(2020, Month.JANUARY, 1, 13, 30, 0, 42);
        System.out.println("The 1st of January lunch time: " + january2020FirstDay_LunchTime);

        //Instant
        Instant currentInstant = Instant.now();
        System.out.println("Current instant: " + currentInstant);
    }
}
