/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author A. Molino
 */
public class Moneda {
    private double dolar;
    private double real;
    private double peso_argentino;
    private static Moneda instancia;
    
    private Moneda(){}

    public static Moneda getInstancia(){
        if (instancia == null){
            instancia = new Moneda();
            return instancia;
        }
        return instancia;
    }
    
    
    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getPeso_argentino() {
        return peso_argentino;
    }

    public void setPeso_argentino(double peso_argentino) {
        this.peso_argentino = peso_argentino;
    }
    
    public double [] Convertir (double monto){
        double [] resultados = new double[3];
        resultados[0] = monto * dolar;
        resultados[1] = monto * real;
        resultados[2] = monto * peso_argentino;

        return resultados;
    }
    
    
}
