package ocp.exame;

public class BitwiseTilda19Example {
    public static void main(String[] args) {
        //Bitwise complement (~) inverts 1 and 0 in number (first you need to convert it into binary)
        var baa = 8; //In binary it is 0000 0000 0000 1000
        var bleat = ~baa; // now it is: 1111 1111 1111 0111 - always + 1 in negative form (2's complement, -9)
        var sheep = ~bleat; // If we do it again, we get original int number

        System.out.println("bleat = " + bleat);
        System.out.println("sheep = " + sheep);
    }
}
