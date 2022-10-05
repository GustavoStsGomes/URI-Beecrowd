package Iniciante;

import java.util.Scanner;

public class Ex1016_Distancia {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int distancia, resultado;

        //realizando a leitura dos valores
        Scanner x = new Scanner(System.in);
        distancia = x.nextInt();
        x.close();

        //realizando a operação
        resultado = (60 * distancia) / 30 ;

        //apresentando resultado
        System.out.printf(resultado + " minutos\n");

    }
}
