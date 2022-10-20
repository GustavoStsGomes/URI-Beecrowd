package Iniciante;

import java.util.Scanner;

public class Ex1133_Resto_da_Divisao {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, y;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        input.close();

        //realizando a operação
        if(x > y){
            for(int c = y+1; c < x; c++){
                if(c % 5 == 2 || c % 5 == 3){
                    System.out.println(c);
                }
            }
        }else{
            for(int c = x+1; c < y; c++){
                if(c % 5 == 2 || c % 5 == 3){
                    System.out.println(c);
                }
            }
        }
    }
}
