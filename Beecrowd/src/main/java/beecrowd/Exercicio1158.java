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
public class Exercicio1158 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int N, X, Y, soma, contador;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        for (int i = 1; i <= N; i++){
            soma = 0;
            contador = 1;
            X = input.nextInt();
            Y = input.nextInt();
            
            while(contador <= Y){
                if (X % 2 == 1){
                    soma += X;
                    contador ++;
                }
                X++;
            }
            System.out.println(soma);
        }
        input.close();
    }
}
