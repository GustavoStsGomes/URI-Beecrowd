package Iniciante;

import java.util.Scanner;

public class Ex1080_Maior_e_Posicao {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int maiorNumero=0, maiorIndex=0;
        int[] numeros = new int[100];

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        for (int cont = 0; cont < 100; cont++){
            numeros[cont] = input.nextInt();
        }
        input.close();

        //realizando a operação
        for(int cont = 0; cont < 100; cont ++){
            if(numeros[cont] > maiorNumero){
                maiorNumero = numeros[cont];
                maiorIndex = cont+1;
            }
        }

        //apresentando resultado
        System.out.printf("%d\n%d\n", maiorNumero, maiorIndex);
    }
}
