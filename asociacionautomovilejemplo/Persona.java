/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacionautomovilejemplo;

/**
 *
 * @author amolino
 */
public class Persona {
    private String documento;
    private String nombre;
    private Automovil auto;

    public Persona(String doc, String nom){
            documento = doc;
            nombre = nom;
    }

    public void compraAuto(Automovil a){
            auto = a;
    }

    public Automovil getAuto(){
            return this.auto;
    }
}
