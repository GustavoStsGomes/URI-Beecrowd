/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1010 {
    public static void main(String[] arg){
        // criando local para armazenar os valores
        int cod1, cod2, num1, num2;
        double valor1, valor2, total;
        
        //trocando localização para EUA para poder usar ponto
        Locale.setDefault(Locale.US);
        
        //realizando a leitura dos valores
        Scanner x = new Scanner(System.in);
        cod1 = x.nextInt();
        num1 = x.nextInt();
        valor1 = x.nextDouble();
        cod2 = x.nextInt();
        num2 = x.nextInt();       
        valor2 = x.nextDouble();
           
        //realizando a operação
        total = (num1 * valor1) + (num2 * valor2);
          
        //apresentando resultado
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
