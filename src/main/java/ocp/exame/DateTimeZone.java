package ocp.exame;

import java.time.*;

public class DateTimeZone {
    public static final String EUROPE_ZAGREB = "Europe/Zagreb";
    public static final String AMERICA_NEW_YORK = "America/New_York";

    public static void main(String[] args) {
        var localDate = LocalDate.of(2022, 3, 13);
        var localTime = LocalTime.of(1, 0);

        var zone = ZoneId.of(AMERICA_NEW_YORK);
        var z = ZonedDateTime.of(localDate, localTime, zone);

        var offset = z.getOffset();
        var duration = Duration.ofHours(3);

        System.out.println("Offset before adding 3 hours: " + offset);
        var later = z.plus(duration);
        System.out.println("Offset after adding 3 hours: " + later.getOffset());
        System.out.println(later.getHour() + " "
                + offset.equals(later.getOffset()));

    }
}
