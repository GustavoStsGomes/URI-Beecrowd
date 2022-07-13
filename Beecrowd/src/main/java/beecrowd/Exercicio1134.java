/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Exercicio1134 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int gasolina = 0, alcool = 0, diesel = 0, menu;
        
        //realizando a leitura e alocação dos valores
        //realizando a operação
        Scanner input = new Scanner(System.in);
        while((menu=input.nextInt()) != 4){
            switch (menu){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    return;    
            }
                    
        }
        input.close();
   
        //apresentando resultado
        System.out.printf("MUITO OBRIGADO\n"
                + "Alcool: %d\n"
                + "Gasolina: %d\n"
                + "Diesel: %d\n", alcool, gasolina, diesel);
        
    }
}
