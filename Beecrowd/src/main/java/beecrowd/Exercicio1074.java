/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Exercicio1074 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int quantidade;
        int[] numeros;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        quantidade = input.nextInt();
        numeros = new int[quantidade];
        for (int cont = 0; cont < quantidade; cont++){
            numeros[cont] = input.nextInt();
        }
        input.close();
        
        //realizando a operação
        //apresentando resultado
        for (int cont = 0; cont < quantidade; cont++){
            if (numeros[cont] == 0){
                System.out.println("NULL\n");
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
