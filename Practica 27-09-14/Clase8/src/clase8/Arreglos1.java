/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 *
 * @author Jose David
 */
public class Arreglos1 {

    int[] vectores = new int[8];

    public int SumarVector() {
        int sumatoria = 0;
        for (int i = 0; i < vectores.length; i++) {
            sumatoria = sumatoria + vectores[i];
        }
        return sumatoria;
    }

    public String ValorAcumulado() {

        String valor = "";
        for (int i = 0; i < vectores.length; i++) {
            if (vectores[i] > 36) {
                valor = valor + vectores[i] + "";
            }
        }
        return valor;
    }

    public String TodosValores() {

        String valor = "";
        for (int i = 0; i < vectores.length; i++) {
            if (vectores[i] > 50) {
                valor = valor + vectores[i] + "";
            }
        }
        return valor;
    }

    public int DosVectores() {
        int vector1[] = new int[4];
        int vector2[] = new int[4];
        int vector3[] = new int[4];

        int sumatoria = 0;
        for (int i = 0; i < vector3.length; i++) {
            sumatoria=vector1[i]+vector2[1];
            
            System.out.println("El total de la suma es "+vector3);
            
        }
        return sumatoria;

    }
   
    
    
    
    
    
    
}


