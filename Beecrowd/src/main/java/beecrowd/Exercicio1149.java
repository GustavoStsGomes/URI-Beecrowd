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
public class Exercicio1149 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int A, N, soma = 0;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        
        while(N <= 0){
            N = input.nextInt();
        }
        input.close();
        
        //realizando a operação     
        for (int c = 0; c < N; c++){
            soma += A;
            A++;
        }
        System.out.println(soma);
    }
}
