package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1116_Dividindo_X_por_Y {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, y, quantidade;
        double resultado;

        //localizando para poder usar ponto ao invez de virgula
        Locale.setDefault(Locale.US);

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        quantidade = input.nextInt();
        for (int cont = 0; cont < quantidade; cont++){
            x = input.nextInt();
            y = input.nextInt();

            //realizando a operação
            if(y == 0){
                System.out.println("divisao impossivel");//apresentando resultado
            }else{
                resultado = (double) x / y;
                System.out.printf("%.1f\n", resultado);//apresentando resultado
            }
        }
        input.close();
    }
}
