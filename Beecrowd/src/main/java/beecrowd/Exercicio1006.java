/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1006 {
    public static void main(String[] arg){
        // criando local para armazenar os valores
        double a, b, c, MP;
        
        Locale.setDefault(Locale.US);
        
        //realizando a leitura dos valores
        Scanner x = new Scanner(System.in);
        a = x.nextDouble();
        b = x.nextDouble();  
        c = x.nextDouble();
           
        //realizando a operação
        MP = ((a * 2) + (b * 3) + (c * 5))/10.0; 
          
        //apresentando resultado
        System.out.printf("MEDIA = %.1f\n", MP);
    }
}
