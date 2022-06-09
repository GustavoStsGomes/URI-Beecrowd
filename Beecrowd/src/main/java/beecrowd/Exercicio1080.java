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
public class Exercicio1080 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int maiorNumero=0, maiorIndex=0;
        int[] numeros = new int[5];
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        for (int cont = 0; cont < 5; cont++){
            numeros[cont] = input.nextInt();
        }
        input.close();
        
        //realizando a operação
        for(int cont = 0; cont < 5; cont ++){
            if(numeros[cont] > maiorNumero){
                maiorNumero = numeros[cont];
                maiorIndex = cont+1;
            }
        } 
        
        //apresentando resultado
        System.out.printf("%d\n%d\n", maiorNumero, maiorIndex);
    }
}
