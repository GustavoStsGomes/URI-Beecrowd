package Iniciante;

import java.util.Locale;

public class Ex1098_Sequencia_IJ_4 {

    public static void main (String[] args){
        //lolizando para poder usar ponto ao invez de virgula
        Locale.setDefault(Locale.US);

        // criando local para armazenar os valores
        double i = 0, j = 1;

        //realizando a operação
        //apresentando resultado
        do{
            double valor = j;
            for(int c = 1; c <= 3; c++){
                if (i == 0.0 || i == 1.0 || i > 1.8){
                    System.out.printf("I=%.0f J=%.0f\n", i, valor);
                }else{
                    System.out.printf("I=%.1f J=%.1f\n", i, valor);
                }
                valor++;
            }

            i = i + 0.2;
            j = j + 0.2;
        }while(i <= 2.0);
    }
}
