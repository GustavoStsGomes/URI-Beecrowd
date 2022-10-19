package Iniciante;

import java.util.Scanner;

public class Ex1132_Multiplos_de_13 {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, y, mult = 0;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        input.close();

        //realizando a operação
        if(x > y){
            for(int c = y; c <= x; c++){
                if(c % 13 != 0){
                    mult+= c;
                }
            }
        }else{
            for(int c = x; c <= y; c++){
                if(c % 13 != 0){
                    mult+= c;
                }
            }
        }

        //apresentando resultado
        System.out.println(mult);
    }
}
