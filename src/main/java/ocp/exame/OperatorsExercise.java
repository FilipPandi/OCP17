package ocp.exame;

public class OperatorsExercise {

    private long addCandy(double fruit, float vegetables){
//        return (int)fruit+vegetables; -> original, not possible.
        return (long)(fruit+vegetables);
    }
    public static void main(String[] args) {

        byte apples = 5;
        short oranges = 10;

        int ban = apples + oranges;
        float ban2 = apples + oranges;
        double ban3 = apples + oranges;
        long ban4 = apples + oranges;

        long x = 10;
        long h = 2 * x;
        System.out.println(h + ":h");

        //8
        int pig = (short)4;
        pig = pig++;
        long goat = (int)2;
        goat -= 1.0;
        System.out.println(pig + " - " + goat);


        //9
        int a = 2, b = 4, c = 2;
        System.out.println(a > 2 ? --c : b++); //4
        System.out.println(a != c ? a : b++); //5
        System.out.println(a > b ? b < c ? b : 2 : 1); //1
        //It doesn't matter if is post or pre increment right here, there is no unary or any other operations to make a difference.

        //10
        short height = 1, weight = 3;
//        short zebra = (byte) weight * (byte) height; - Original code, doesn't compile here!
        int zebra = (byte) weight * (byte) height;
        double ox = 1 + height * 2 + weight;
        long giraffe = 1 + 9 % height + 1;
        System.out.println(zebra);
        System.out.println(ox);
        System.out.println(giraffe);

        //11
        int s1 = (2 * 4) % 3; //2
        int s2 = 3 * 2 % 3; //0
        int s3 = 5 * (1 % 2); //5
        System.out.println(s1 + ", " + s2 + ", " + s3);


        //17
        int ticketsTaken = 1;
        int ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++; //5
        ticketsTaken *= 2; //4
        ticketsSold += (long)1; //6
        System.out.println(ticketsSold + " - " + ticketsTaken);

        //21
        int start = 7;
        int end = 4;
        end += ++start; //12
        start = (byte)(Byte.MAX_VALUE + 1); //-128 (unary operators (+,-,/,%..) executes always before any surrounding numeric binary or ternary operations)
        System.out.println(start + " † " + end);

        int myFavouriteNumber = 8;
        int bird = ~myFavouriteNumber; //-9
        int plane = -myFavouriteNumber; //-8
        var superman = bird == plane ? 5 : 10; //10
        System.out.println(bird + ", " + plane + ", " + --superman); //9

    }
}
