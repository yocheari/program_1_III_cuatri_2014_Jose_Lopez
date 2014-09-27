/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**6
 *
 * @author Jose David
 */
public class Ejercicio1 {

    /*Escribir un programa que solicite la carga de un valor positivo y nos muestre desde 1 
     hasta el valor ingresado de uno en uno
     Ejemplo: si ingresamos 30 debe de mostrar en pantalla los numeros del 1 al 30 
     * @param args the command line arguments
     */
    private String numeros = "";

    public Ejercicio1(int numero) {
        this.ImprimirNumeros(numero);
    }

    private String ImprimirNumeros(int numero) {
       for(int i =0; i < 10; i++){
       numeros+= i++;
       
       
       }
       return getNumeros();
    }
    public String getNumeros(){
    return numeros;
    }
            

}
