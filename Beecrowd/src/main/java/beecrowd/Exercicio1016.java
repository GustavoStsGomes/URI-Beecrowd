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
public class Exercicio1016 {
    
    public static void main (String[] args){
       // criando local para armazenar os valores
       int distancia, resultado;
       
       //realizando a leitura dos valores
       Scanner x = new Scanner(System.in);
       distancia = x.nextInt();
       x.close();
       
       //realizando a operação
       resultado = (60 * distancia) / 30 ;
       
       //apresentando resultado
       System.out.printf(resultado + " minutos\n");
       
    }
    
}
