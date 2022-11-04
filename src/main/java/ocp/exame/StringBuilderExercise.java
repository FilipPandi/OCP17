package ocp.exame;

public class StringBuilderExercise {

    public static void main(String[] args) {
        var line1 = new StringBuilder("1");
        var anotherLine1 = line1.append("2");

        System.out.print(line1 == anotherLine1);
        System.out.print(" ");
        System.out.print(line1.length() + "\n");

        //16. What is the output of the following?
        var line2 = new String("-");
        var anotherLine2 = line2.concat("-");
        System.out.print(line2 == anotherLine2);
        System.out.print(" ");
        System.out.print(line2.length());
    }
}
