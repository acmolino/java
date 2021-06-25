/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacionautomovilejemplo;

/**
 *
 * @author VERITON
 */
public class Automovil {
    private String marca;
    private String modelo;
    private Persona duenio;
    
    public Automovil(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Persona getDuenio(){
	return this.duenio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    
  
    
}
