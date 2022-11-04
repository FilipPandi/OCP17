package ocp.exame;

public class IncrementDecrement {
    public static void main(String[] args) {
        int meal = 5;
        int tip = 2;
        System.out.println("tip--(tip=" + tip + "): " + (tip-- + meal)); //nakon operacije

        tip = 2;
        System.out.println("--tip(tip=" + tip + "): " + (--tip + meal)); //prije operacije

    }
}