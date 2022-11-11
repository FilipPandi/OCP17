package ocp.exame;

public class StringExample32 {
    public static void main(String[] args) {
        var happy = " :) - (: "; // index: 1, 2, 3, 4 ,n
        var really = happy.trim();

        int end = happy.length();

        var question = happy.substring(1, end - 1);
        System.out.println(really.equals(question));
    }
}
