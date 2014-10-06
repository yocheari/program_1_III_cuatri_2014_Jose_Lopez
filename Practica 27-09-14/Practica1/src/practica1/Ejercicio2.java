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

}
