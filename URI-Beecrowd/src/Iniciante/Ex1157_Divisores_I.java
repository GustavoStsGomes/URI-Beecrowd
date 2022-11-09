package Iniciante;

import java.util.Scanner;

public class Ex1157_Divisores_I {

    public static void main(String[] args){
        // criando local para armazenar os valores
        int N;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        input.close();

        //realizando a operação
        //apresentando resultado
        for (int i = 1; i <= N; i++){
            if(N % i == 0){
                System.out.println(i);
            }
        }
    }
}
