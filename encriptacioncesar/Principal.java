/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacioncesar;

import java.util.Scanner;

/**
 *
 * @author A. Molino
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Encriptacion E = new Encriptacion();
        Scanner teclado = new Scanner(System.in, "ISO-8859-1");
        int op=0;
        int rot = 0;
        String texto;
        
        /*Menú*/
        do{
            System.out.println("\n#####  Opciones   ########\n");
            System.out.println("1 - Configurar rotación");
            System.out.println("2 - Encriptar texto");
            System.out.println("3 - Desencriptar texto");
            System.out.println("0 - Salir"); 
            System.out.print(">");
            op = teclado.nextInt();
            
            switch(op){
                case 1: 
                    System.out.println("\nIngrese rotación");
                    System.out.print(">");
                    rot = teclado.nextInt();
                break;
                    
                case 2:
                    teclado.nextLine(); //Para que absorba el caracter del enter
                    System.out.println("\nIngrese la palabra:");
                    System.out.print(">");
                    texto = teclado.nextLine();
                    System.out.println(E.posicionesATexto(E.moverPosiciones(E.ubicarLetras(texto), rot)));
                break;
                    
                case 3:
                    teclado.nextLine();//Para que absorba el caracter del enter
                    System.out.println("\nIngrese la palabra:");
                    System.out.print(">");
                    texto = teclado.nextLine();
                    System.out.println(E.posicionesATexto(E.moverPosiciones(E.ubicarLetras(texto), (rot*-1))));
                break;
                    
                case 0:
                    System.out.println("\nGracias, adios");
                break;
                
                default:
                    System.out.println("Ojo el dedo");
                break;
            }
            
        }while (op!=0);
 
       
    }
    
}
