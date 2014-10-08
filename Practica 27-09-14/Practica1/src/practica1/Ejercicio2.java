/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Jose David
 */
public class Ejercicio2 {

    private int X;
    private int Y;
    private double N;
    private double M;

    public Ejercicio2() {
        this.X = 0;
        this.Y = 0;
        this.N = 0;
        this.M = 0;
    }

    Ejercicio2(int x, int y, double m, double n1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double Sumatoria(int X, int Y, double N, double M) {
        return X + Y + N + M;
    }
    public double Resta(int X, int Y, double N, double M) {
        double Resta;
        Resta = X - Y - N - M;
        return Resta;

    }
    public double Multiplicacion(int X, int Y, double N, double M) {
        double Multi;
        Multi = X + Y + N + M;
        return Multi;
    }
    public  double Divicion(int X, int Y, double N, double M) {
        double Div;
        Div = (X / Y) / (N / M);
        return Div;
    }

    String suma(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String resta(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String division(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String suma2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String resta2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String division2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String multiplicacion2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
