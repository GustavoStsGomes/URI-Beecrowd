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
public class Exercicio1150 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, z, soma = 0, contador = 0;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        z = input.nextInt();
        
        while(z <= x){
            z = input.nextInt();
        }
        input.close();
        
        //realizando a operação     
        while(soma < z){
            soma += x;
            x++;
            contador++;
        }
        System.out.println(contador);
    }
}
