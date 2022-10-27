package Iniciante;

import java.util.Scanner;

public class Ex1149_Somando_Inteiros_Consecutivos {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int A, N, soma = 0;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        while(N <= 0){
            N = input.nextInt();
        }
        input.close();

        //realizando a operação
        for (int c = 0; c < N; c++){
            soma += A;
            A++;
        }
        System.out.println(soma);
    }
}
