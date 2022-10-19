package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1118_Varias_Notas_Com_Validacao {

    public static void main (String[] args){
        // criando local para armazenar os valores
        double nota, media = 0, cont, total;
        int controle = 1;

        //localizando para poder usar ponto ao invez de virgula
        Locale.setDefault(Locale.US);

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        //realizando a operação
        while(controle != 2){
            if(controle == 1){
                cont = 0;
                total = 0;
                while(cont != 2){
                    nota = input.nextDouble();
                    if(nota >= 0.0 && nota <= 10.0){
                        total += nota;
                        cont ++;
                    }else {
                        System.out.println("nota invalida");//apresentando resultado
                    }
                }
                media = total / 2.0;
                //apresentando resultado
                System.out.printf("media = %.2f\n", media);
            }
            System.out.println("novo calculo (1-sim 2-nao)");
            controle = input.nextInt();
        }
        input.close();
    }
}
