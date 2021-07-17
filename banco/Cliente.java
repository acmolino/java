/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author amolino
 */
public class Cliente {
    private String nombre;
    private int monto;

    /**
     * Constructor
     * @param nombre 
     */
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    public Cliente(String nombre, int monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto() {
        return monto;
    }
    
    /**
     * Método de depoistar
     * @param monto 
     */
    public void depositar(int monto){
        this.monto =+ monto;     
    }
    
    /**
     * Método de extraccion
     * 
     * Verifica si el saldo es suficiente
     * @param monto 
     */
    public void extraer(int monto){
        if(this.monto > monto){
            this.monto =- monto;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    
    
}
