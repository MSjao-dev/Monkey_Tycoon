package Mokey_Tycoon;
import java.util.Scanner;
import java.util.Random;

public class Func {

    public static int gerarRandom(int max) {
        Random rand = new Random();
        return rand.nextInt(max);  
    }
    
}
