package ocp.exame;

public class StringBuilderAppend27 {

    public static final String notStrippedString = "      2 462436              ";

    public static void main(String[] args) {
        var teams = new StringBuilder("333");
        teams.append(" 806");
        teams.append(" 1601");
        System.out.print(teams);

        String stripped = notStrippedString.strip();
        System.out.println("\n Non stripped = " + notStrippedString);
        System.out.println("stripped = " + stripped);
    }
}
