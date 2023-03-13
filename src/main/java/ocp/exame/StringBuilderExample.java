package ocp.exame;

public class StringBuilderExample {
    public static void main(String[] args) {
        //Tip: String object is IMMUTABLE, but StringBuilder object is NOT!
        String alphabet = "";
        for (char current = 'a'; current <= 'z'; current++) {
            alphabet += current; //Every String is in memory and then garbage collected each loop (for example 'a', 'ab' - 'a' is assigned for garbage collecting, 'abc' - 'ab' is assigned for garbage collecting etc.)
        }
        System.out.println(alphabet);


        StringBuilder alphabetSB = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++) {
            alphabetSB.append(current); //Like this we can remove garbage collector - StringBuilder is NOT immutable
        }
        System.out.println(alphabetSB);


        String sub = alphabetSB.substring(alphabetSB.indexOf("k"), alphabetSB.indexOf("wxyz"));

        int len = alphabetSB.length(); //26
        char ch = alphabetSB.charAt(10); //k
        System.out.println(sub);
        System.out.println(len);
        System.out.println(ch);


        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        StringBuilder same = sb.append("+end");
        System.out.println(same);
        System.out.println(sb);
        System.out.println(sb.equals(same));

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //Again both objects are the same, 'cas they are pointing to the same reference ("new StringBuilder("abc")")

        //INSERT
        StringBuilder stringBuilder = new StringBuilder("animals");
        stringBuilder.insert(5, "THIS_IS_ANIMALISTIC");
        System.out.println(stringBuilder);
        //DELETE
        stringBuilder.delete(5, 24);
        System.out.println(stringBuilder);
        //REVERSE
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
