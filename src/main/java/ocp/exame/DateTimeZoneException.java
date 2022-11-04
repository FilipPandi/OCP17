package ocp.exame;

import java.time.*;

public class DateTimeZoneException {

    public static final String EUROPE_ZAGREB = "Europe/Zagreb";
    public static final String AMERICA_NEW_YORK = "America/New_York";

    public static void main(String[] args) {
        var localDate = LocalDate.of(2022, 3, 13);
        var localTime = LocalTime.of(3, 0);
        var zone = ZoneId.of(AMERICA_NEW_YORK);
        var z = ZonedDateTime.of(localDate, localTime, zone);

        System.out.println("Zone : " + z);
    }
}
