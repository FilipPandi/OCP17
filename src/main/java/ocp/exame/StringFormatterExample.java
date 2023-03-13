package ocp.exame;

public class StringFormatterExample {
    public static void main(String[] args) {
        var name = "Pero";
        var number = 5;
        System.out.printf("Hello %s, order %d is ready!%n",
                name, number);
        System.out.println(("Hello %s, order %d is ready!".formatted(name, number)));
    }
}
