package Iniciante;

import java.util.Scanner;

public class Ex1004_Produto_Simples {

    public static void main(String[] arg){
        // criando local para armazenar os valores
        int a, b, c;

        //realizando a leitura dos valores
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        b = x.nextInt();

        //realizando a multiplicação
        c = a * b;

        //apresentando resultado
        System.out.println("PROD = " + c);
    }
}
