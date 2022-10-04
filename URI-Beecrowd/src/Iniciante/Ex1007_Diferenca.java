package Iniciante;

import java.util.Scanner;

public class Ex1007_Diferenca {
    public static void main(String[] arg){
        // criando local para armazenar os valores
        int A, B, C, D, DIFERENCA;

        //realizando a leitura dos valores
        Scanner x = new Scanner(System.in);
        A = x.nextInt();
        B = x.nextInt();
        C = x.nextInt();
        D = x.nextInt();

        //realizando a matemática
        DIFERENCA = (A * B - C * D);

        //apresentando resultado
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
