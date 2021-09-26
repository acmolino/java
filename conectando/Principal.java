/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectando;

import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author amolino
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Consultas c = new Consultas();
        
        System.out.println("Ingrese documento");
        String doc = teclado.next();
        System.out.println("Ingrese nombre");
        String nom = teclado.next();
        
        c.IngresarDatos(doc, nom);
        
        ResultSet rs = c.devolverRegistros();
        while(rs.next()){
            System.out.print(rs.getString("doc"));
            System.out.print("\t");
            System.out.print(rs.getString("nombre"));
            System.out.print("\n");
            
        }
        
        
    }
    
}
