/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Locale;

public class Exercicio1155 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        double S = 1;
        
        //localizando para poder usar ponto ao invez de virgula
        Locale.setDefault(Locale.US);
        
        //realizando a operação
        for (int i = 2; i <= 100; i++) {
            S += 1.00 / i;
    	}
        
        //apresentando resultado
        System.out.printf("%.2f\n", S);
    }
}
