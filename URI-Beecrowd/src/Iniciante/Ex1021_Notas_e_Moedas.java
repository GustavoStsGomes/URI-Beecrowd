package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021_Notas_e_Moedas {

    public static void main (String[] args){
        // criando local para armazenar os valores
        double total, nota=100.00, moeda= 100.0;
        int valor, caso = 0;

        //lolizando para poder usar ponto ao invez de virgula
        Locale.setDefault(Locale.US);

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        total = input.nextDouble();
        input.close();

        //apresentando resultado notas
        System.out.println("NOTAS:");
        while (caso <= 5){
            // realizando casting para poder pegar valor inteiro do float
            valor = (int) ((int) total / nota);
            System.out.printf("%d nota(s) de R$ %.2f\n", valor, nota);
            total = total % nota;

            switch (caso){
                case 0 -> nota = 50.0;
                case 1 -> nota = 20.0;
                case 2 -> nota = 10.0;
                case 3 -> nota = 5.0;
                case 4 -> nota = 2.0;
            }
            caso++;
        }
        caso = 0;

        // multiplicando por 100 para facilitar calculos de double e apresentação de quantidade de moedas
        total = total * 100.0;

        //apresentando resultado moedas
        System.out.println("MOEDAS:");
        while (caso <= 5){
            valor = (int) ((int) total / moeda);
            System.out.printf("%d moeda(s) de R$ %.2f\n", valor, moeda/100);
            total = total % moeda;

            switch (caso){
                case 0 -> moeda = 50.0;
                case 1 -> moeda = 25.0;
                case 2 -> moeda = 10.0;
                case 3 -> moeda = 5.0;
                case 4 -> moeda = 1.0;
            }
            caso++;
        }
    }
}
