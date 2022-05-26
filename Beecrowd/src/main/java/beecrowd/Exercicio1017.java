/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1017 {
    
    public static void main(String[] args){
        // criando local para armazenar os valores
        int tempo, velocidade;
        double res;
        String resultado;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        tempo = input.nextInt();
        velocidade = input.nextInt();
        input.close();
        
        //realizando a operação 
        res = (velocidade * tempo) / 12.0;
        resultado = Double.toString(res);

        
        
        //apresentando resultado
        System.out.printf("%.3f\n", res);
    }
    
}
