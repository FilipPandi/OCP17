package ocp.exame;

import java.time.LocalDate;
import java.time.Month;

public class DateBefore {

    public static void main(String[] args) {
        int year = 1874;
        int month = Month.MARCH.getValue(); //.getValue()
        int day = 24;
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.isBefore(LocalDate.now()));

    }
}
