/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Scanner;

public class Exercicio1145 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, y;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        input.close();

        //realizando a operação
        //apresentando resultado
        for(int c=1; c<=y; c++){
            System.out.print(c);
            if(c % x == 0) System.out.println("");
            else System.out.print(" ");
        }
    }
}
