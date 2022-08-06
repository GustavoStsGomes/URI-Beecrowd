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
public class Exercicio1153 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int N, fatorial = 1;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        input.close();
        
        //realizando a operação
        for (int i = 1; i <= N; i++){
            fatorial = fatorial * i;
        }
        
        //apresentando resultado
        System.out.println(fatorial);
    }
}
