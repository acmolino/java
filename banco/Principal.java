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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos el banco
        Banco b=new Banco();
        
        //Realizamos operaciones
        b.operar(b.getCliente1(), 1000, 1);
        b.operar(b.getCliente2(), 1500, 1);
        
        //Saldo del cliente 1
        System.out.println((b.getCliente1().getMonto()));
        
        //Total del banco
        System.out.println(b.depositosTotales());
        
        
    }
    
}
