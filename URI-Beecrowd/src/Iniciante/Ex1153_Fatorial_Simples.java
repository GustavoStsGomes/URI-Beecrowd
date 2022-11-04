package Iniciante;

import java.util.Scanner;

public class Ex1153_Fatorial_Simples {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int N, fatorial = 1;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        input.close();

        //realizando a operação
        for (int i = 1; i <= N; i++){
            fatorial = fatorial * i;
        }

        //apresentando resultado
        System.out.println(fatorial);
    }
}
