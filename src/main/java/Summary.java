public class Summary {
    public static void main(String[] args) {
        var test = 1;

        switch (test) { //int, byte, char, Character, Integer, String, enum, var
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("Default!");
        }
        int i = 1;
        int j = 1;
        int w = 1;
        int dw = 1;

        L1:
        for (; i <= 5; i++) {
            System.out.println("L1 Loop! Count: " + i);
            for (; j <= 5; j++) {
                System.out.println("L2 Loop! Count: " + j);
                if (i == 2) continue L1;
                L3:
                while (w > 0) {
                    System.out.println("WHILE LOOP i: " + i + " || j: " + j + " || w: " + w + "");
                    if (w > 3) {
                        break;
                    }
                    L4:
                    do {
                        System.out.println("DOWHILE i: " + i + " || j: " + j + " || w: " + w + " || dw: " + dw + "");
                        if (dw > 3) {
                            break;
                        }
                        dw++;
                    }
                    while (dw > 0);
                    w++;
                }
            }
        }
    }
}
