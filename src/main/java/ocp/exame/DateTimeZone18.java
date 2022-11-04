package ocp.exame;

import java.time.*;

public class DateTimeZone18 {

    public static void main(String[] args) {
        //18. In the United States, daylight saving time ends on November 6, 2022 at 02:00 a.m. and we
        //repeat the previous hour. What is the output of the following?
        var localDate = LocalDate.of(2022, Month.NOVEMBER, 6);
        var localTime = LocalTime.of(1, 0);
        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);
        var offset = z.getOffset();

        for (int i = 0; i < 6; i++)
            z.plusHours(1); //This is immutable - not adding hour to zone.

        System.out.print(z.getHour() + " "
                + offset.equals(z.getOffset()));
    }
}
