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
public class Exercicio1073 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int numero, resultado;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        numero = input.nextInt();
        input.close();
        
        //realizando a operação
        //apresentando resultado
        for(int cont = 2; cont <= numero; cont ++){
            if(cont % 2 == 0){
                resultado = (int) Math.pow(cont, 2);
                System.out.printf("%d^2 = %d\n", cont, resultado);
                
            }
        } 
    }
}
