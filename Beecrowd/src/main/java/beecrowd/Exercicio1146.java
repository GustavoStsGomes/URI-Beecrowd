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
public class Exercicio1146 {
    public static void main(String[] args){
        // criando local para armazenar os valores
        int x, c;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        
        while(true){
            x = input.nextInt();
            if(x == 0)break;
            else {
                //realizando a operação
                for (c = 1; c <= x; c++){
                    if (c == x) System.out.println(c);
                    else System.out.print(c+" ");
                }
            }
            
        }
        input.close();
    }
}
