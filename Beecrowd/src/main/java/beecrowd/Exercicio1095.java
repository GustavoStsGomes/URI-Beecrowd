/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

/**
 *
 * @author Gustavo
 */
public class Exercicio1095 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int i = 1, j = 60;
        //realizando a operação
        //apresentando resultado
        do{
            System.out.printf("I=%d J=%d\n", i,j);
            i = i + 3;
            j = j - 5;        
        }while(j >= 0);
        
    }
}

