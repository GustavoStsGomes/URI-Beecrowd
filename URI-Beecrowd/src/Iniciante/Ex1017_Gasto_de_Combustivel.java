package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017_Gasto_de_Combustivel {

    public static void main(String[] args){
        // criando local para armazenar os valores
        int tempo, velocidade;
        double res;

        //lolizando para poder usar ponto ao invez de virgula
        Locale.setDefault(Locale.US);

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        tempo = input.nextInt();
        velocidade = input.nextInt();
        input.close();

        //realizando a operação
        res = (velocidade * tempo) / 12.0;

        //apresentando resultado
        System.out.printf("%.3f\n", res);
    }
}
