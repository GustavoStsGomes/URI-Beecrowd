package Iniciante;

import java.util.Scanner;

public class Ex1144_Sequencia_Logica {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int quantidade;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        quantidade = input.nextInt();
        input.close();

        //realizando a operação
        //apresentando resultado
        for(int x=1; x<=quantidade; x++){
            System.out.printf("%d %d %d\n", x, (int) Math.pow(x, 2), (int) Math.pow(x, 3));
            System.out.printf("%d %d %d\n", x, 1 + (int) Math.pow(x, 2), 1 + (int) Math.pow(x, 3));
        }
    }
}
