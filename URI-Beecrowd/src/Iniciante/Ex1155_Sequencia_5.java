package Iniciante;

import java.util.Locale;

public class Ex1155_Sequencia_5 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        double S = 1;

        //localizando para poder usar ponto ao invez de virgula
        Locale.setDefault(Locale.US);

        //realizando a operação
        for (int i = 2; i <= 100; i++) {
            S += 1.00 / i;
        }

        //apresentando resultado
        System.out.printf("%.2f\n", S);
    }
}
