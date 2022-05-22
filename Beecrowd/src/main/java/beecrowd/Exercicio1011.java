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
public class Exercicio1011 {
    
    public static void main(String[] args){
        //criando variaveis para armazenar dados
        double resultado, raio;
        
        //trocando localização para EUA para poder usar ponto
        Locale.setDefault(Locale.US);
        
        
        //fazendo leitura e alocação dos valores
        Scanner x = new Scanner(System.in);
        raio = x.nextDouble();
        x.close();
        
        //realizando operação
        resultado = (4/3.0) * 3.14159 * Math.pow(raio, 3);
        
        //apresentando resultado
        System.out.printf("VOLUME = %.3f\n",resultado);
        
    }
    
}
