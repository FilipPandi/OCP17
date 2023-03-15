package ocp.exame;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationDateTimeExamples {

    public static void main(String[] args) {

        //PERIOD - intended for bigger units of time (months, days, years) - begins with "P" (P1Y2M30D)
        var date = LocalDate.of(2023, Month.JANUARY, 1);
        var time = LocalTime.of(10, 30, 20, 542);

        var dateTime = LocalDateTime.of(date, time);

        var period = Period.ofMonths(1);

        System.out.println(date.plus(period)); // 2023-02-01
        System.out.println(dateTime.plus(period)); // 2023-02-01T10:30:20:542
//        System.out.println(time.plus(period)); // error

        System.out.println("\n");
        //DURATION - intended for smaller units of time (hours, minutes, seconds, millis, nanos - it is used with objects that have time in it)
        // - begins with "PT" (PT1H)
        var daily = Duration.ofDays(1); // PT24H
        var hourly = Duration.ofHours(1); // PT1H
        var everyMinute = Duration.ofMinutes(1); // PT1M
        var everyTenSeconds = Duration.ofSeconds(10); // PT10S
        var everyMilli = Duration.ofMillis(1); // PT0.001S
        var everyNano = Duration.ofNanos(1); // PT0.000000001S
        //Rewritten ->
        var daily1 = Duration.of(1, ChronoUnit.DAYS);
        var hourly1 = Duration.of(1, ChronoUnit.HOURS);
        var everyMinute1 = Duration.of(1, ChronoUnit.MINUTES);
        var everyTenSeconds1 = Duration.of(10, ChronoUnit.SECONDS);
        var everyMilli1 = Duration.of(1, ChronoUnit.MILLIS);

        var one = LocalTime.of(5, 15);
        var two = LocalTime.of(8, 25);

        System.out.println(ChronoUnit.HOURS.between(one, two));
        System.out.println(ChronoUnit.MINUTES.between(one, two));
        LocalTime truncated = time.truncatedTo(ChronoUnit.MINUTES); //10:30
        System.out.println(truncated);

        var dateTest = LocalDate.of(2022, 5, 25);
        var periodTest = Period.ofDays(1);
        var duration = Duration.ofDays(1);
        System.out.println(dateTest.plus(periodTest)); // 2022–05–26
//        System.out.println(dateTest.plus(duration)); // Unsupported unit: Seconds
    }
}
