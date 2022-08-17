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
public class Exercicio1157 {
    public static void main(String[] args){
        // criando local para armazenar os valores
        int N;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        input.close();
        
        //realizando a operação       
        //apresentando resultado
        for (int i = 1; i <= N; i++){
            if(N % i == 0){
                System.out.println(i);
            }
        }
    }
}
