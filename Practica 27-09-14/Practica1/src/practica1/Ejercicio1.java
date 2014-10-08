/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
package practica1;

/**
 *
 * @author Jose David
 */
public class Ejercicio1 {

    private int N;
    private double A;
    private char C = 0;

    public Ejercicio1() {
        this.A = 0;
        this.N = 0;
        this.C = 0;

    }

    Ejercicio1(int n, double a, char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double Sumatoria(double A, int N) {
        double Sumatoria;
        Sumatoria = A + N;
        return Sumatoria;

    }

    public double Resta(double A, int N) {
        double Resta;
        Resta = N - A;
        return Resta;

    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public char getC() {
        return C;
    }

    public void setC(char C) {
        this.C = C;
    }

    String Letra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String suma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String resta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
