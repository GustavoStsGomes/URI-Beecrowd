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
public class Exercicio1151 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int N, prox, ant = 0, atual = 1;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        input.close();
        
        //realizando a operação
        //apresentando resultado
        for (int c = 1; c <= N; c++){   
            if (c == N) System.out.println(ant);
            else System.out.print(ant+" ");
            prox = ant + atual;
            ant = atual;
            atual = prox;
        }
    }
}
