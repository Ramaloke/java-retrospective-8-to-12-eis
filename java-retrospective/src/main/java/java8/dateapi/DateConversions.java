package java8.dateapi;

import java.sql.Timestamp;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateConversions {
    public static void main(String[] args) {
        //Date to LocalDate
        convertDateToLocalDate(new Date());

        //Date to LocalDateTime
        convertDateToLocalDateTime(new Date());

        //LocalDate to Date
        convertLocalDateToDate(LocalDate.now());

        //LocalDateTime to Date
        convertLocalDateTimeToDate(LocalDateTime.now());
    }

    private static void convertDateToLocalDate(Date date) {
        System.out.println("Convert Date to LocalDate");
        System.out.println(MessageFormat.format("\tDate class: {0}.\n\tValue: {1}", date.getClass().getName(), date));

        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(MessageFormat.format("\tDate class: {0}.\n\tValue: {1}", localDate.getClass().getName(), localDate));
    }

    private static void convertDateToLocalDateTime(Date date) {
        System.out.println("Convert Date to LocalDateTime");
        System.out.println(MessageFormat.format("\tDate class: {0}.\n\tValue: {1}", date.getClass().getName(), date));

        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(MessageFormat.format("\tDate class: {0}.\n\tValue: {1}", localDateTime.getClass().getName(), localDateTime));

        System.out.println("Convert Date to LocalDateTime via java.sql.Timestamp");
        LocalDateTime localDateTime_via_Timestamp = new Timestamp(date.getTime()).toLocalDateTime();
        System.out.println(MessageFormat.format("\tDate class: {0}.\n\tValue: {1}", localDateTime_via_Timestamp.getClass().getName(), localDateTime_via_Timestamp));

    }

    private static void convertLocalDateToDate(LocalDate localDate) {
        System.out.println("Convert LocalDate to Date");
        System.out.println(MessageFormat.format("\tDate class: {0}.\n\tValue: {1}", localDate.getClass().getName(), localDate));

        java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
        System.out.println(MessageFormat.format("\tDate class: {0}.\n\tValue: {1}", sqlDate.getClass().getName(), sqlDate));

        Date date = Date.from(localDate.atStartOfDay().atZone(ZoneId.of("GMT")).toInstant());
        System.out.println(MessageFormat.format("\tDate class: {0}.\n\tValue: {1}", date.getClass().getName(), date));
    }

    private static void convertLocalDateTimeToDate(LocalDateTime localDateTime) {
        System.out.println("Convert LocalDateTime to Date");
        System.out.println(MessageFormat.format("\tDate class: {0}.\n\tValue: {1}", localDateTime.getClass().getName(), localDateTime));

        Date timestamp = Timestamp.valueOf(localDateTime);
        System.out.println(MessageFormat.format("\tDate class: {0}.\n\tValue: {1}", timestamp.getClass().getName(), timestamp));

        Date date = Date.from(localDateTime.atZone(ZoneId.of("GMT")).toInstant());
        System.out.println(MessageFormat.format("\tDate class: {0}.\n\tValue: {1}", date.getClass().getName(), date));
    }
}
