package Iniciante;

import java.util.Scanner;

public class Ex1046_Tempo_de_Jogo {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int inicio, fim, tempo;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        inicio = input.nextInt();
        fim = input.nextInt();
        input.close();

        //realizando a operação

        if (inicio > fim) {
            tempo = (24 - (inicio - fim));

        } else if (fim  > inicio) {
            tempo = fim - inicio;

        } else {
            tempo = 24;
        }

        //apresentando resultado
        System.out.printf("O JOGO DUROU %d HORA(S)", tempo);

    }
}
