package ocp.exame;

import java.util.List;

public class DecisionStatementsAndLoopsExercise {

    static void printLocation(Animal a) {
        long type = switch (a) {
            case BIRD -> 1;
            case FISH -> 2;
            case MAMMAL -> 3;
            default -> 4;
        };
        System.out.println("Type: " + type);
    }

    public static void main(String[] args) {
        compareIntegers(2);

        Number x = 5;

        if (x instanceof List data) {
            System.out.println(data);
        }

        final Integer counter = 5;

        String banana = "Banana man";
        final int bananas = 2; //If used in case statement - needs to be constant! (value is known in compile time!)

        //Normal switch with breaks (switch without breaks get into all cases).
        switch (counter) {
            case 1:
                System.out.println(banana);
                break;
            case bananas:
                System.out.println(bananas);
                break;
            case 3:
                System.out.println("it is three!");
                break;
            default:
                System.out.println("I'm default!");
                break;
        }

        //Switch with arrow operator (arrow operator works like break - IT IS NOT LAMBDA).
        switch (counter) {
            case 1, 5 -> System.out.println("it is one!");
            case 2, 7 -> System.out.println("it is two!");
            case 3, 8 -> System.out.println("it is three!");
            default -> System.out.println("I'm default!");
        }

        //Yield usage switch (it is similar to return but it does not break out of switch it continue - it returns all values without breaking out).
        int fish = 5;
        int length = 12;

        var name = switch (fish) {
            case 1 -> "Goldfish";
//            case 2 -> {} doesn't compile - doesn't use yield to return (blocks are not needing semicolon)
            case 3 -> {
                if (length > 10) {
                    yield "Blobfish";
                } else {
                    yield "Cutfish";
                }
            }
            default -> "Swordfish";
        };


        // NESTED LOOPS
        int hungry = 8;
        while (hungry > 0) {
            do {
                hungry -= 2; //6, 4, 1
            } while (hungry > 5);

            hungry--; //3, 0
            System.out.println("Hungry: " + hungry + ", ");
        }


        //breaks in loops using optional labels
        int[][] list = {{1, 13}, {5, 2}, {2, 2}};
        int sv = 2;
        int pox = -1;
        int poy = -1;

        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == sv) {
                    pox = i;
                    poy = j;
                    System.out.println("LOOP i: " + i + " ,j: " + j);

                    break PARENT_LOOP; //Different result for each break
//                    break CHILD_LOOP;
//                    break;
                }
            }
        }
        if (pox == -1 || poy == -1) {
            System.out.println("Value " + sv + " not found!");
        } else {
            System.out.println("Value " + sv + " found at: " + "(" + pox + ", " + poy + ")");
        }

        //continue statements in loops
        CLEANING:
        for (char stables = 'a'; stables <= 'd'; stables++) { //a, b, c, d
            for (int leobard = 1; leobard < 4; leobard++) { // 1 - 3
                if (stables == 'b' || leobard == 2) {
                    continue CLEANING;
//                    continue; - control is returned to inner loop (ANIMAL_LOOP), the same thing would be "continue ANIMAL_LOOP;".
                }
                System.out.println("Cleaning: " + stables + ", " + leobard);
            }

        }

        //Prints all elements
        int[] weather = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = weather.length - 1; i >= 0; i--) {
            System.out.println(weather[i]);
        }

        //Question 9. - how to get 2 in print out.
        int count = 0;
        for (int row = 1; row <= 3; row++)
            for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0) {
//                    break;
                    count++;
                }
            }
        System.out.println("count: " + count);


        printLocation(Animal.MAMMAL);

        int pa = 4, animals = 2, pre = -1;
        while ((pa = pa + 1) < 10) {
        }
        do {
        } while (animals++ <= 1);
        for (; pre < 2; pre += 2) ;
        System.out.println("pa = " + pa + " ,animals = " + animals + " ,pre = " + pre);

//        int i = 0;
//        for(;;) {
//            System.out.println(i++);
//        }


        int height = 1;
        while (height++ < 10) {
            long humidity = 12;
            L2:
            do {
                if (humidity-- % 12 == 0) continue L2;
                int temperature = 30;
                for (; ; ) {
                    temperature++;
                    if (temperature > 50) continue L2;
                }
            } while (humidity > 4);
        }

        int id = 30;

        System.out.println(switch (id) {
            case 10 -> {
                yield "jane";
            }
            case 20 -> {
                yield "Lisa";
            }
            case 30 -> "Kelly";
            default -> "unssigned";
        });

        int te = 4;
        long hum = -te + te * 3;
        if (te >= 4)
            if (hum < 6) System.out.println("Tooo low");
            else System.out.println("Just right");
        else System.out.println("Too high");
    }


    private static void compareIntegers(Number number) {
        if (number instanceof final Integer data) { // Subtype should never be the same type as parameter (data and number).
            System.out.println(data.compareTo(5));
        }
    }

    enum Animal {BIRD, FISH, MAMMAL}
}
