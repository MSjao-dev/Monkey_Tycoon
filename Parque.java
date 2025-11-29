package Monkey_Tycoon;
import java.util.ArrayList;
import java.util.Scanner;
public class Parque {
    ArrayList<Macacos> ListaMacacos= new ArrayList();
    Scanner leia=new Scanner(System.in);
    private boolean vitoria=false;
    private boolean derrota = false;
    int visitantes=0;
    int NotaBH=0;
    int Bananas=0;
    int comeco=1;
    void inicio(){
        if(comeco==1){
            System.out.println("Como hoje é seu primeiro dia irei lhe doar dois macacos, apenas escolha o nome deles.");
            for(int i=0;i<2;i++){
                System.out.println("Insira o nome do macaco N°"+(i+1)+": ");
                String Nome=leia.nextLine();
                String Habilidade;
                int num=Func.gerarRandom(2);
                if(num==1){
                    Habilidade="Mortal pra trás";
                }else{
                    Habilidade="Balançar o rabo";
                }
                int Fichas=Func.gerarRandom(20);
                ListaMacacos.add(new Macacos(Nome,Habilidade));
            }
            comeco++;
        }
        
    }

    void ExecRodada(){
        inicio();
        MostrarStatus();
        Jogos();
        ComprarMacaco();
        VerifVitoria();
        VerifDerrota();
    }

    void Jogos(){
        int limite=7;
        int QJogo=1;
        boolean sair=false;
        System.out.println("O jogo de hoje será: ");
        switch(QJogo){
            case 1:

            break;

            case 2:

            break;

            case 3:

            break;

            case 4:

            break;

            case 5:

            break;

            case 6:

            break;

            case 7:

            break;
        }

    }

    void MostrarStatus(){
        System.out.println("Visitantes Frequentes: "+visitantes);
        System.out.println("Nota no MuseusCore: "+NotaBH); 
        System.out.println("Número de Bananas: "+Bananas);
        System.out.println();
        System.out.println("Deseja mostrar as informações dos macacos?[1 para sim e 2 para não]");
        int res=leia.nextInt();
        if(res==1){
            for(int i=0; i<ListaMacacos.size();i++){
                ListaMacacos.get(i).InfoMacaco();
            }
        }else{

        }

    }
    void ComprarMacaco(){
        int precoMacaco=0;
        int escolha=0;
        switch(escolha){
            case 0:
            break;
            case 1:
            precoMacaco=50;
            break;
            case 2:
            precoMacaco=150;
            break;
            case 3:
            precoMacaco=400;
            break;
            
        }
        Bananas=Bananas-precoMacaco;
    }

    void VerifVitoria(){
        if(Bananas>=1000&&visitantes>=100){
            vitoria=true;
        }
    }
    void VerifDerrota(){
        if(Bananas<=0){
            derrota=true;
        }
    }
    public boolean isDerrota(){
        return derrota;
    }
    public boolean isVitoria(){
        return vitoria;
    }

}