/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author Jose David
 */
public class Ejercicio1 {

    double[] salarios = new double[5];

    public void AgregarSalario(double salario) {
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] == 0) {

                salarios[i] = salario;
                break;

            }

        }

    }

    public String ImprimirSueldos() {

        String Imprimir = "";
        for (int i = 0; i < salarios.length; i++) {
            Imprimir += "El salalrio del trabajador # " + (i + 1) + "Es de " + salarios[i] + "\n";

        }
        return Imprimir;

    }

}
