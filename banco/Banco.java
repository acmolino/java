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
public class Banco {
   private Cliente cliente1, cliente2, cliente3;
    
    /**
     * Constructor
     * 
     * En forma de fantasia ya crea los clientes
     */
    public Banco() {
        cliente1 = new Cliente("Juan");
        cliente2 = new Cliente("Ana");
        cliente3 = new Cliente("Pedro");
    }

    
    public Cliente getCliente1() {
        return cliente1;
    }

    public Cliente getCliente2() {
        return cliente2;
    }

    public Cliente getCliente3() {
        return cliente3;
    }

   /**
    * Metodo para extraer o deposiutar de la cuenta bancaria
    * 
    * @param cli Objeto cliente al cual vamos a realizar operacion
    * @param monto Monto a deposita o estraer
    * @param tipo Tipo de operacion, deposito 1, extraccion 2
    */
    public void operar(Cliente cli, int monto, int tipo){
        if (tipo==1){
            cli.depositar(monto);
        }
        if(tipo==2){
            cli.extraer(monto);
        }
    }
    
    /**
     * Método para mostrar dinero total del banco
     * 
     * @return suma de todos los fondos de los clientes
     */
    public int depositosTotales(){
        int total = cliente1.getMonto() + cliente2.getMonto() + cliente3.getMonto();
        return total;
    }


    
    
    
}
