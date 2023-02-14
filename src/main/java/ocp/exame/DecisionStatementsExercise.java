package ocp.exame;

import java.util.List;

public class DecisionStatementsExercise {
    private static void compareIntegers(Number number) {
        if (number instanceof final Integer data) { // Subtype should never be the same type as parameter (data and number).
            System.out.println(data.compareTo(5));
        }
    }

    public static void main(String[] args) {
        compareIntegers(2);

        Number x = 5;

        if (x instanceof List data) {
            System.out.println(data);
        }

        if (!(x instanceof Integer x)) {

        }
    }
}
