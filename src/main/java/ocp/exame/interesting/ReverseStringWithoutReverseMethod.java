package ocp.exame.interesting;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringWithoutReverseMethod {
    public static void main(String[] args) {
        String thisIsStringToBeReversed = "This needs to be backwards?";

        char[] charArray = thisIsStringToBeReversed.toCharArray();
        List<Character> result = new ArrayList<>();

        for (int i = charArray.length; i <= charArray.length && i != 0; i--) {
            result.add(charArray[i - 1]);
        }

        StringBuilder finalResult = new StringBuilder();

        for (Character c : result) {
            //mutable
            finalResult.append(c);
        }


        System.out.println("Normal: %s".formatted(thisIsStringToBeReversed));
        System.out.println(("This should be backwards: %s%n").formatted(finalResult));
    }
}
