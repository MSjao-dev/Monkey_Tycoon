package Monkey_Tycoon.Utils;

public class TextUtils {

    public static void linha() {
        System.out.println("----------------------------");
    }

    public static void titulo(String txt) {
        linha();
        System.out.println("  " + txt.toUpperCase());
        linha();
    }

    public static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {}
    }

    public static void type(String txt) {
        for (char c : txt.toCharArray()) {
            System.out.print(c);
            pause(20);
        }
        System.out.println();
    }
}
