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
public class Exericico1047 {
    public static void main (String[] args){
        // criando local para armazenar os valores
        int hInicio, mInicio, hFim, mFim, totalH = 0, totalM = 0;
        
        //realizando a leitura e alocação dos valores
        Scanner input = new Scanner(System.in);
        hInicio = input.nextInt();
        mInicio = input.nextInt();
        hFim = input.nextInt();
        mFim = input.nextInt();
        input.close();
        
        //realizando a operação,
        if (hInicio == hFim && mInicio == mFim && hInicio == mFim) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            if (hInicio > hFim) {
                totalH = 24 - hInicio + hFim;
            } else if (hInicio < hFim) {
                totalH = 24 - (24 - hFim + hInicio);
            }
            if (mInicio > mFim) {
                totalM = 60 + mFim - mInicio;
                if (hInicio == hFim) {
                    totalH = 24 + totalH - 1;
                } else {
                    totalH = totalH - 1;
                }
            } else {
                totalM = mFim - mInicio;
            }
            System.out.println("O JOGO DUROU " + totalH + " HORA(S) E " + totalM + " MINUTO(S)");
        }  
    }
}
