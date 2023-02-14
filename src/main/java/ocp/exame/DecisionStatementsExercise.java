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

        final Integer counter = 5;

        //Normal switch with breaks (switch without breaks get into all cases).
        switch (counter) {
            case 1:
                System.out.println("it is one!");
                break;
            case 2:
                System.out.println("it is two!");
                break;
            case 3:
                System.out.println("it is three!");
                break;
            default:
                System.out.println("I'm default!");
                break;
        }

        //Switch with lambdas (lambda works like break).
        switch (counter) {
            case 1 -> System.out.println("it is one!");
            case 2 -> System.out.println("it is two!");
            case 3 -> System.out.println("it is three!");
            default -> System.out.println("I'm default!");
        }


    }
}
