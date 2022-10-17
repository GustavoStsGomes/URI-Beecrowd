package Iniciante;

import java.util.Scanner;

public class Ex1101_Sequencia_de_Numeros_e_Soma {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, y, inicio, fim, soma = 0;

        Scanner input = new Scanner(System.in);

        while((x = input.nextInt()) > 0 && (y= input.nextInt()) > 0){
            if (x <= y) {
                inicio = x;
                fim = y;
            }else{
                inicio = y;
                fim = x;
            }

            for (int c = inicio; c <= fim; c++){
                System.out.printf("%d ", c);
                soma = soma + c;
            }
            System.out.printf("Sum=%d\n", soma);
            soma = 0;
        }

        input.close();
    }
}
