/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Scanner;
        
public class Exercicio1003 {
       public static void main(String[] arg){
           // criando local para armazenar os valores
           int a, b, c;
           
           //realizando a leitura dos valores
           Scanner x = new Scanner(System.in);
           a = x.nextInt();
           b = x.nextInt();
           
          //realizando a soma
          c = a + b;
          
          //apresentando resultado
          System.out.println("SOMA = " + c);
       }
}
