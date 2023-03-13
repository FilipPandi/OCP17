package ocp.exame;

public class IndentExample {
    public static void main(String[] args) {
        var block = """
                a
                 b
                c""";

        var concat = "  a\n"
                + " b\n"
                + " c";

        System.out.println("CONCAT");
        System.out.println(concat.length());
        System.out.println(concat.indent(-1).length());
        System.out.println(concat.indent(-4).length());
        System.out.println(concat);
        System.out.println("---------------");
        System.out.println(concat.indent(-1));
        System.out.println("---------------");
        System.out.println(concat.indent(-4));
        System.out.println("\n");
        System.out.println("BLOCK");
        System.out.println(block);
        System.out.println(block.indent(-1));
        System.out.println(block.indent(-4));
        System.out.println("---------------");
        System.out.println(block.length());
        System.out.println(block.indent(-1).length());
        System.out.println(block.indent(1).length());
        System.out.println("---------------");
        System.out.println(concat.stripIndent().length());
        System.out.println(block.stripIndent().length());
    }
}
