/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Locale;

/**
 *
 * @author Gustavo
 */
public class Exercicio1156 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        double S = 1, i, j;
        
        //localizando para poder usar ponto ao invez de virgula
        Locale.setDefault(Locale.US);
        
        //realizando a operação
        for (i = 3, j = 2; i <= 39; i+=2, j*=2) {
            S += i / j;
    	}
        
        //apresentando resultado
        System.out.printf("%.2f\n", S);
    }
}
