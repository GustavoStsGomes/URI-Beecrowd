package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1154_Idades {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int idade, total = 0, contador = 0;
        double media;

        //localizando para poder usar ponto ao invez de virgula
        Locale.setDefault(Locale.US);

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        while ((idade = input.nextInt()) >= 0){
            total += idade;
            contador++;
        }
        input.close();

        //realizando a operação
        media = (double) total / contador;

        //apresentando resultado
        System.out.printf("%.2f\n", media);
    }
}
