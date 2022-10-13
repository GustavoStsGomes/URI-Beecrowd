package Iniciante;

import java.util.Scanner;

public class Ex1074_Par_ou_Impar {

    public static void main (String[] args){
        int quantidade;
        int[] numeros;

        Scanner input = new Scanner(System.in);
        quantidade = input.nextInt();
        numeros = new int[quantidade];
        for (int cont = 0; cont < quantidade; cont++){
            numeros[cont] = input.nextInt();
        }
        input.close();

        for (int cont = 0; cont < quantidade; cont++){
            if (numeros[cont] == 0){
                System.out.println("NULL");
            }else if (numeros[cont] % 2 == 0){
                if (numeros[cont] > 0){
                    System.out.println("EVEN POSITIVE");
                }else{
                    System.out.println("EVEN NEGATIVE");
                }
            }else {
                if (numeros[cont] > 0){
                    System.out.println("ODD POSITIVE");
                }else{
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
    }
}
