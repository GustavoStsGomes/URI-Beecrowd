/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1021 {
    
    public static void main (String[] args){
        // criando local para armazenar os valores
        double total, nota=100.00, moeda= 1.0;
        int valor;
        
        //lolizando para poder usar ponto ao invez de virgula
        Locale.setDefault(Locale.US);
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        total = input.nextDouble();
        input.close();
        valor = (int) total;
                
        //apresentando resultado   
        System.out.println("NOTAS:");
        while (nota >= 2.0){ 
            valor = (int) ((int) total / nota);
            System.out.printf("%d nota(s) de R$ %.2f\n", valor, nota);
            total = total % nota;
            
            switch ((int)nota){
                case 100 -> nota = 50.0;
                case 50 -> nota = 20.0;
                case 20 -> nota = 10.0;
                case 10 -> nota = 5.0;
                case 5 -> nota = 2.0;
                case 2 -> nota = 1.0;
            }
        }
        System.out.println("MOEDAS:");
        while (total != moeda){ 
            valor = (int) ((int) total / moeda);
            System.out.printf("%d nota(s) de R$ %.2f\n", valor, moeda);
            total = total % moeda;
            
            switch ((int)moeda){
                case 1 -> moeda = 0.50;
                case 50 -> moeda = 0.25;
                case 20 -> moeda = 0.10;
                case 10 -> moeda = 0.05;
                case 5 -> moeda = 0.01;
            }
        }
    }
}
