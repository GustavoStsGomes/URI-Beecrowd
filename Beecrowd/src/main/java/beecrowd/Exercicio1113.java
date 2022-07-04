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
public class Exercicio1113 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, y;

        Scanner input = new Scanner(System.in);
        
        while((x = input.nextInt()) != (y= input.nextInt())){
            if (x < y) {
                System.out.println("Crescente");
            }else{
                System.out.println("Decrescente");
            }
        }
        input.close();    
    }
}
