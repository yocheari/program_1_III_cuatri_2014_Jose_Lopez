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
public class Ejercicio2 {

    private float alturas[] = new float[5];

    public void AgregarAltura(float altura) {
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] == 0) {
                alturas[i] = altura;
                break;

            }
        }

    }

    public float Promedio() {
        float sumaPromedio = 0;
        float Promedio = 0;

        for (int i = 0; i < alturas.length; i++) {

            sumaPromedio += alturas[i];
        }
        Promedio = sumaPromedio / alturas.length;
        return Promedio;

    }

    public String ContarPersonas() {
        String personasBajas = "";
        String personasAltas = "";
        String retorno = "";
        float promedio = this.Promedio();
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > promedio) {
                personasAltas += "La persona # " + (i + i) + "es alta" + "\n";

            } else {
                personasBajas += "La persona # " + (1 + 1) + "es baja" + "\n";

            }

        }
        retorno = personasAltas + "\n";
        return retorno;
    }

}
