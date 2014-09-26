package clase.pkg2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class CuentaBancaria {

    private double saldoInicicial;
    private boolean hayError;

    //metodo constructor
    //este metodo sirve
    public void Deposito(double monto) {
        setSaldoInicicial(getSaldoInicicial() + monto);

    }
//Este metodo sirva para disminuir la cuenta de un usuario
//

    public void Retiro(double monto) {

        if (getSaldoInicicial() >= monto) {
            setSaldoInicicial(getSaldoInicicial());
        } else {
            setHayError(true);
        }

    }

    public CuentaBancaria() {
        this.saldoInicicial = 0;
        this.hayError = false;
    }

    public double getSaldoInicicial() {
        return saldoInicicial;
    }

    public void setSaldoInicicial(double saldoInicicial) {
        this.saldoInicicial = saldoInicicial;
    }

    public boolean isHayError() {
        return hayError;
    }

    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
}
