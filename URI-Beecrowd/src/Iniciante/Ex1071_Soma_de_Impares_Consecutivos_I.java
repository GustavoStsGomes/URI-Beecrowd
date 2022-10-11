package Iniciante;

import java.util.Scanner;

public class Ex1071_Soma_de_Impares_Consecutivos_I {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, y, inicio, fim, soma=0;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        input.close();

        //realizando a operação
        //descobrindo o menor valor para correr laço
        if (x < y){
            inicio = x;
            fim = y;

        }else {
            inicio = y;
            fim = x;

        }

        //passando por todos os numeros do menor ao maior
        for (int cont = inicio+1; cont < fim; cont ++){
            //somando os impares
            if(cont % 2 != 0){
                soma += cont;
            }
        }

        //apresentando resultado
        System.out.printf("%d\n", soma);

    }
}
