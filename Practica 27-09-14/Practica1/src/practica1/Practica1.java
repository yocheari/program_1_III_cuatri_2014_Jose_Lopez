/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Jose David
 */
public class Practica1 {

    private static Scanner teclado;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        
        // TODO code application logic here
        //declaracion de variables

        int N;
        double A;
        char C ='0';
        // 
        Ejercicio1 oPractica1 = new Ejercicio1();
        System.out.println("Digite el valor de N");
        teclado=new Scanner(System.in);
        N =teclado.nextInt();
        System.out.println("Digite el valor de A");
        teclado=new Scanner(System.in);
        A =teclado.nextDouble();
        System.out.println("Digite el valor de C");
        teclado=new Scanner(System.in);
        C=teclado.nextLine().charAt(0);
        System.out.println("El valor de N es: " + N + "\n El valor de A es: " + A + "\n El valor de C es: " + C);
        System.out.println(oPractica1.Sumatoria(A, N));
        System.out.println(oPractica1.Resta(A, N));
        System.out.println(C);
    }

}
