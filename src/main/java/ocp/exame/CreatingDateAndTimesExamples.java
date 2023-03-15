package ocp.exame;

import java.time.*;

//Date and time classes are IMMUTABLE!!!!
public class CreatingDateAndTimesExamples {
    public static void main(String[] args) {
        //LocalDate contains just DATE - no time no zone.
        System.out.println(LocalDate.now());
        //LocalTime contains just TIME - no date no zone.
        System.out.println(LocalTime.now());
        //LocalDateTime contains both a date and time - no zone.
        System.out.println(LocalDateTime.now());
        //ZonedDateTime contains date, time and zone.
        System.out.println(ZonedDateTime.now());

        //Combining date and time into one object.
        var date1 = LocalDate.of(2023, Month.APRIL, 10);
        var time1 = LocalTime.of(7, 53, 53, 225);
        var dateTime1 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1);

        //Zone
        var zoneId = ZoneId.of("US/Eastern");
        var zone = ZonedDateTime.of(2023, 1, 30, 10, 50, 20,
                222, zoneId);
        var zoneSimple = ZonedDateTime.of(date1, time1, zoneId);
        System.out.println(zoneSimple);

//        var d = new LocalDate(); // DOES NOT COMPILE - date time object cannot be instanced.

        System.out.println("\n");

        var dateTest1 = LocalDate.of(2023, Month.JANUARY, 1);
        dateTest1 = dateTest1.plusDays(30);
        System.out.println(dateTest1);
    }
}
