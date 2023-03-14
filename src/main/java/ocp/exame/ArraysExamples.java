package ocp.exame;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {

        String[] sortingArray = { "10", "9", "100"};
        Arrays.sort(sortingArray);
        for (String s : sortingArray) {
            System.out.print(s + " "); //It prints alphabetically - so 1 comes before 9 (10, 100, 9).
        }

        System.out.println("\n");

        int[] numbers = {2, 4, 6, 8};
        int resultOfSearch = Arrays.binarySearch(numbers, 6);
        System.out.println("Search: " + resultOfSearch); // Only works if array is sorted (suggests on witch index to put different elements if element doesn't exist already in array)

        //COMPARE
        System.out.println("Compare: " + Arrays.compare(new int[] {1}, new int[] {2})); //negative means that first array is smaller than sec, zero equals, positive if first is larger.

        //MISMATCH
        System.out.print("Mismatch: " + Arrays.mismatch(new int[] {1}, new int[] {1}));
        System.out.print(" " + Arrays.mismatch(new int[] {1, 2}, new int[] {3, 5, 6, 6}));
        System.out.print(" " + Arrays.mismatch(new String[] {"a"}, new String[] {"A"}));
    }
}
