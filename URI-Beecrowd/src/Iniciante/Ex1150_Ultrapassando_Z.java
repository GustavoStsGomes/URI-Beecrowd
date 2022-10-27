package Iniciante;

import java.util.Scanner;

public class Ex1150_Ultrapassando_Z {

    public static void main (String[] args){
        // criando local para armazenar os valores
        int x, z, soma = 0, contador = 0;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        z = input.nextInt();

        while(z <= x){
            z = input.nextInt();
        }
        input.close();

        //realizando a operação
        while(soma < z){
            soma += x;
            x++;
            contador++;
        }
        System.out.println(contador);
    }
}
