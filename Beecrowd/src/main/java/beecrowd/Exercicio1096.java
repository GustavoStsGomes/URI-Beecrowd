/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

/**
 *
 * @author Gustavo
 */
public class Exercicio1096 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int i = 1, j = 7;
        //realizando a operação
        //apresentando resultado
        do{
            for(int c = j; c >= 5; c--){
                System.out.printf("I=%d J=%d\n", i,c);
            }
            i = i + 2;
        }while(i <= 9);
    }
}
