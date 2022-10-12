package Iniciante;

import java.util.Scanner;

public class Ex1072_Intervalo_2 {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int quantidade, dentro = 0, fora = 0;
        int[] numeros;

        //realizando a leitura, alocação dos valores e operacao
        Scanner input = new Scanner(System.in);
        quantidade = input.nextInt();
        numeros = new int [quantidade];
        for (int cont = 0; cont < quantidade; cont++){
            numeros[cont] = input.nextInt();

            if(numeros[cont] >= 10 && numeros[cont] <= 20){
                dentro ++;
            }else {
                fora ++;
            }
        }
        input.close();

        //apresentando resultado
        System.out.printf("%d in\n%d out\n", dentro, fora);
    }
}
