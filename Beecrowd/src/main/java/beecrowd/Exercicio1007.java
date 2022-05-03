/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Scanner;

public class Exercicio1007 {
    public static void main(String[] arg){
           // criando local para armazenar os valores
           int A, B, C, D, DIFERENCA;
           
           //realizando a leitura dos valores
           Scanner x = new Scanner(System.in);
           A = x.nextInt();
           B = x.nextInt();
           C = x.nextInt();
           D = x.nextInt();
           
          //realizando a matemática
          DIFERENCA = (A * B - C * D);
          
          //apresentando resultado
          System.out.println("DIFERENCA = " + DIFERENCA);
       }
}
