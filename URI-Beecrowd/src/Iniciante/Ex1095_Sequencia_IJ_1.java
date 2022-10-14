package Iniciante;

public class Ex1095_Sequencia_IJ_1 {
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
