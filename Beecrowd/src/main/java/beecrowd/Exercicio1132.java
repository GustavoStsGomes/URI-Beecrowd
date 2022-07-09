/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;


import java.util.Scanner;

public class Exercicio1132 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, y, mult = 0;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        input.close();
        
        //realizando a operação
        if(x > y){
            for(int c = y; c <= x; c++){
                if(c % 13 != 0){
                    mult+= c;
                }
            }
        }else{
            for(int c = x; c <= y; c++){
                if(c % 13 != 0){
                    mult+= c;
                }
            }
        }
        
        //apresentando resultado
        System.out.println(mult);
    }
}
