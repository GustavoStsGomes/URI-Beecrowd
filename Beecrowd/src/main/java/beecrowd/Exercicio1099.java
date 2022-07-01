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
public class Exercicio1099 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int quantidade, x, y, inicio, fim, soma = 0;
        
        //realizando a leitura e alocação dos valores
        //realizando a operação
        //apresentando resultado
        Scanner input = new Scanner(System.in);
        quantidade = input.nextInt();
        for(int c = 1; c <= quantidade; c++){
            x = input.nextInt();
            y= input.nextInt();
            
            if (x <= y) {
                inicio = x;
                fim = y;
            }else{
                inicio = y;
                fim = x;
            }
            
            for (int c2 = inicio + 1; c2 < fim; c2++){
                if(c2 % 2 != 0){
                    soma = soma + c2;
                }
            }
            System.out.println(soma);
            soma = 0;
        }
        input.close();
    }
}
