package Iniciante;

public class Ex1096_Sequencia_IJ_2 {
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
