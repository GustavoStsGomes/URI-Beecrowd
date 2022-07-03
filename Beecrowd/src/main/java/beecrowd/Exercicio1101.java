/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Scanner;

public class Exercicio1101 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, y, inicio, fim, soma = 0;

        Scanner input = new Scanner(System.in);
        
        while((x = input.nextInt()) > 0 && (y= input.nextInt()) > 0){
            if (x <= y) {
                inicio = x;
                fim = y;
            }else{
                inicio = y;
                fim = x;
            }
            
            for (int c = inicio; c <= fim; c++){
                System.out.printf("%d ", c);
                soma = soma + c;
            }
            System.out.printf("Sum=%d\n", soma);
            soma = 0;
        }
        
        input.close();    
    }
}
