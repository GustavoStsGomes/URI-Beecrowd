/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Exercicio1012 {
    public static void main(String[] args){
        // criando variaveis para valores
        double A, B, C, tri, circulo, trapezio, quadrado, retangulo;
        
        //lolizando para poder usar ponto ao invez de virgula
        Locale.setDefault(Locale.US);
        
        // lendo e alocando valores
        Scanner input = new Scanner(System.in);
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        input.close();
        
        // realizando operações
        tri= (A * C)/2 ;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) * C / 2;
        quadrado = B * B;
        retangulo = A * B;
        
        // exibindo resultados
        System.out.printf("TRIANGULO: %.3f\n", tri);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
                            
        
        
    }
    
}
