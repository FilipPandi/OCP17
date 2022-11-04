package ocp.exame;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateExerciseBefore {
    public static void main(String[] args) {
        var waffleDay = LocalDate.of(2022, Month.MARCH, 25);
        var period = Period.of(1, 6, 3);
        var later = waffleDay.plus(period);
        later.plusDays(1);
        var thisOne = LocalDate.of(2023, Month.SEPTEMBER, 28);
        var thatOne = LocalDate.of(2023, Month.SEPTEMBER, 29);
        System.out.println(later.isBefore(thisOne) + " "
                + later.isBefore(thatOne));

        //15. What is a possible result of the following?
        var montyPythonDay = LocalDate.of(2023, Month.MAY, 10);
        var aprilFools = LocalDate.of(2023, Month.APRIL, 1);
        var duration = Duration.ofDays(1); //This won't compile - duration is in seconds, .minus() or plus() doesn't support seconds (Period.ofDays() would work)

        var result = montyPythonDay.minus(duration);
        System.out.println(result + " " + aprilFools.isBefore(result));
    }

}
