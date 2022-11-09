package Iniciante;

import java.util.Scanner;

public class Ex1158_Soma_de_Impares_Consecutivos_III {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int N, X, Y, soma, contador;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        for (int i = 1; i <= N; i++){
            soma = 0;
            contador = 1;
            X = input.nextInt();
            Y = input.nextInt();

            while(contador <= Y){
                if (X % 2 == 1){
                    soma += X;
                    contador ++;
                }
                X++;
            }
            System.out.println(soma);
        }
        input.close();
    }
}
