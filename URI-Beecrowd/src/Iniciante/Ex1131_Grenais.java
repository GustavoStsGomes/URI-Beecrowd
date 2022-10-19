package Iniciante;

import java.util.Scanner;

public class Ex1131_Grenais {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int controle = 1, interPlacar = 0, gremioPlacar = 0,
                interJogos = 0, gremioJogos = 0, empate = 0, grenais = 0;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        //realizando a operação
        while(controle != 2){
            if(controle == 1){
                interPlacar = input.nextInt();
                gremioPlacar = input.nextInt();
                grenais++;

                if(interPlacar > gremioPlacar){
                    interJogos++;
                }else if (gremioPlacar > interPlacar){
                    gremioJogos++;
                }else {
                    empate++;
                }
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            controle = input.nextInt();
        }
        input.close();

        System.out.printf("%d grenais\n"
                        + "Inter:%d\n"
                        + "Gremio:%d\n"
                        + "Empates:%d\n",
                grenais, interJogos, gremioJogos, empate);

        if (interJogos > gremioJogos){
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Gremio venceu mais");
        }
    }
}
