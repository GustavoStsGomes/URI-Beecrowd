package Iniciante;

public class Ex1097_Sequencia_IJ_3 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int i = 1, j = 7;
        //realizando a operação
        //apresentando resultado
        do{
            int valor = j; // valor para exibicao decrescente
            for(int c = 1; c <= 3; c++){ // contador que repete 3 vezes
                System.out.printf("I=%d J=%d\n", i, valor);
                valor --;
            }
            i = i + 2; // acrescimo de i de impar em impar
            j = j + 2;
        }while(i <= 9);
    }
}
