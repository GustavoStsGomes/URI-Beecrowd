package Iniciante;

import java.util.Scanner;

public class Ex1151_Fibonacci_Facil {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int N, prox, ant = 0, atual = 1;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        input.close();

        //realizando a operação
        //apresentando resultado
        for (int c = 1; c <= N; c++){
            if (c == N) System.out.println(ant);
            else System.out.print(ant+" ");
            prox = ant + atual;
            ant = atual;
            atual = prox;
        }
    }
}
