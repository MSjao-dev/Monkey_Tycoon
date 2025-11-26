
package Mokey_Tycoon;

public class Jogo {
    public static void main(String[] args){
        Parque parque = new Parque();
        int contDia=1;
        while(contDia<30){
            if(contDia==1){
                System.out.println("Bem vindo, Agora você é o gerente do museu de macacos da Bahia.");
                System.out.println("Você tem 30 dias para botar ele nos eixos, pois a antiga administração acabou com tudo.");
                System.out.println("Boa sorte Gafanhoto!!");
            }

            parque.ExecRodada();
            
            if(parque.isVitoria()){
                System.out.println("Você conseguiu, agradecemos por ajudar, o parque está indo muito bem!!!");
                break;
            }
            if(parque.isDerrota()){
                System.out.println("Você faliu o parque.");
                break;
            }
            contDia++;
        }
    }
}
