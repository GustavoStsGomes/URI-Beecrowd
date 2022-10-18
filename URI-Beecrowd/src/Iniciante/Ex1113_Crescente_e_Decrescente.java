package Iniciante;

import java.util.Scanner;

public class Ex1113_Crescente_e_Decrescente {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, y;

        Scanner input = new Scanner(System.in);

        while((x = input.nextInt()) != (y= input.nextInt())){
            if (x < y) {
                System.out.println("Crescente");
            }else{
                System.out.println("Decrescente");
            }
        }
        input.close();
    }
}
