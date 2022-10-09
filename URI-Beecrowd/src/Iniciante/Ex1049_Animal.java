package Iniciante;

import java.util.Scanner;

public class Ex1049_Animal {
    public static void main (String[] args){
        // criando local para armazenar os valores
        String primeira = null, segunda = null, terceira = null, resposta = null;

        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        primeira = input.next();
        segunda = input.next();
        terceira = input.next();
        input.close();

        //realizando a operação
        if(primeira.equals("vertebrado")){
            if(segunda.equals("ave")){
                if(terceira.equals("carnivoro")){
                    resposta = "aguia";

                }else {
                    resposta = "pomba";

                }
            }else {
                if (terceira.equals("onivoro")){
                    resposta = "homem";

                }else {
                    resposta = "vaca";

                }
            }

        }else {
            if(segunda.equals("inseto")){
                if(terceira.equals("hematofago")){
                    resposta = "pulga";

                }else {
                    resposta = "lagarta";

                }
            }else {
                if(terceira.equals("hematofago")){
                    resposta = "sanguessuga";

                }else {
                    resposta = "minhoca";

                }
            }
        }

        //apresentando resultado
        System.out.printf("%s\n", resposta);
    }
}
