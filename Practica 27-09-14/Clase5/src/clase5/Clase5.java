/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author Jose David
 */
public class Clase5 {

    public static void main(String[] args) {
        boolean validar = true;
        int valor1 = 0;
        int valor2 = 0;
        double resultado;
        char continuar;
        int option = 0;

        Scanner teclado = new Scanner(System.in);
        Operaciones oOperaciones = new Operaciones();

        do {
            System.out.println("Digite la operacion a evaluar");
            System.out.println("1 Suma");
            System.out.println("2 Resta");
            System.out.println("3 Division");
            System.out.println("4 Multipicacion");
            System.out.println("5 raiz");
            System.out.println("6 Potencia");

            option = Integer.parseInt(teclado.nextLine());

            switch (option) {
                case 1:
                    System.out.println("Digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Sumar(valor1, valor2);
                    System.out.println(resultado);

                    break;

                case 2:
                    System.out.println("Digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Resta(valor1, valor2);
                    System.out.println(resultado);

                    break;

                case 3:
                    System.out.println("Digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Division(valor1, valor2);
                    System.out.println(resultado);

                    break;

                case 4:
                    System.out.println("Digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Multiplicacion(valor1, valor2);
                    System.out.println(resultado);

                    break;

                case 5:
                    System.out.println("Digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Raiz(valor1);
                    System.out.println(resultado);

                    break;

                case 6:
                    System.out.println("Digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    oOperaciones.Potencia(valor1, valor2);
                    resultado = oOperaciones.Sumar(valor1, valor2);
                    System.out.println(resultado);

                    break;

                default:
                    break;

            }
            System.out.println("Desea continuar con otra operacion S/N");
             teclado = new Scanner(System.in);
            continuar = teclado.nextLine().charAt(0);

            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }

        } while (validar);
    }
}
