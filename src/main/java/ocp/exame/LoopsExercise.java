package ocp.exame;

public class LoopsExercise {
    public static void main(String[] args) {
        int w = 0, r = 1;
        String ime = "";
        while (w < 2) {
            ime += "A";
            do {
                ime += "B";
                if (ime.length() > 0) ime += "C";
                else break;
            } while (r <= 1);
            r++;
            w++;
        }
        System.out.println(ime);
    }
}
