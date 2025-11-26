package Monkey_Tycoon.Minigames;
import Monkey_Tycoon.Macacos;
import java.util.ArrayList;
import java.util.Scanner;
public class RoletaRussa {
    Scanner leia = new Scanner (System.in);
    private ArrayList<Macacos> Lista;

    public RoletaRussa(ArrayList<Macacos> listaRecebida) {
        this.Lista = listaRecebida;
    }
    
    void jogar(){
         System.out.println("Roleta Russa De Bananas");
            System.out.println();
            System.out.println("Deseja ver o tutorial do jogo? [1-Sim;2-Não]");
            int res=leia.nextInt();
            if(res==1){
                System.out.println();
                System.out.println("Você deverá escolher pelo menos dois macacos para jogar este jogo.");
                System.out.println("No lançador de bananas havera 5 bananas boas e 1 banana podre");
                System.out.println("Cada macaco pega uma banana:\n" + //
                                        "\n" + //
                                        "Banana boa: o macaco ganha fichas.\n" + //
                                        "\n" + //
                                        "Banana podre: o macaco perde energia e felicidade.");
                System.out.println("O objetivo é acumular fichas enquanto mantém seus macacos felizes e com energia.");
                System.out.println("Fique de olho na energia e felicidade deles para não comprometer minigames futuros!");
            }
            boolean sair = true;
            do{
                boolean wilson=true;
                System.out.println("Escolha pelo menos dois macacos para começar o jogo: ");
                int nummacaco=Lista.size();
                while(wilson){
                    if(nummacaco!=0){
                        for (int i=0;i<nummacaco;i++){
                            System.out.print(i+1+"-");
                            Lista.get(i).InfoMacaco();

                        }
                    }
                    System.out.print("Escolha um macaco: ");



                }

            }while(!sair);
    }
    
}
