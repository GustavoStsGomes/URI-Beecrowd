package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006_Media_2 {
    public static void main(String[] arg){
        // criando local para armazenar os valores
        double a, b, c, MP;

        //trocando localização para EUA para poder usar ponto
        Locale.setDefault(Locale.US);

        //realizando a leitura dos valores
        Scanner x = new Scanner(System.in);
        a = x.nextDouble();
        b = x.nextDouble();
        c = x.nextDouble();

        //realizando a operação
        MP = ((a * 2) + (b * 3) + (c * 5))/10.0;

        //apresentando resultado
        System.out.printf("MEDIA = %.1f\n", MP);
    }
}
