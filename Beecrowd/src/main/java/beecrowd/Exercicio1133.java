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
public class Exercicio1133 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, y;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        input.close();
        
        //realizando a operação
        if(x > y){
            for(int c = y+1; c < x; c++){
                if(c % 5 == 2 || c % 5 == 3){
                    System.out.println(c);
                }
            }
        }else{
            for(int c = x+1; c < y; c++){
                if(c % 5 == 2 || c % 5 == 3){
                    System.out.println(c);
                }
            }
        }
    }
}
