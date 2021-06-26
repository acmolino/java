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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("Adrian", "123");
        Automovil a = new Automovil("Fiat", "Uno");
        p.compraAuto(a);

        System.out.println(p.getAuto().getMarca());
    }
    
}
