package agenda.logica;

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
        Scanner teclado = new Scanner(System.in);
        System.out.print("Bienvenido. Pon tu nombre para crear tu agenda:");
        Agenda A = new Agenda(teclado.nextLine());
        int op = 0;
        do{
            System.out.println("\t##############################");
            System.out.println("\t#######Menu Agenda   #########");
            System.out.println("\t##############################\n");
            
            System.out.println("\t 1. Nuevo contacto");
            System.out.println("\t 2. Ver agenda");
            System.out.println("\t 3. Buscar por telefono");
            System.out.println("\t 0. Salir");
            
            System.out.print(">");
            
            op = teclado.nextInt();
            
            switch(op){
                case 1: 
                    teclado.nextLine(); // Por problema entre nextIn y nextLine
                    System.out.println("Ingreso de nuevo contacto\n");
                    /*Pido los datos*/
                    String nom, ape, tel;
                   
                    System.out.println("Ingrese nombre");
                    nom = teclado.nextLine();
                    System.out.println("Ingrese apellido");
                    ape = teclado.nextLine();
                    System.out.println("Ingrese teléfono");
                    tel = teclado.nextLine();
                    /*Lo agrego a la agenda*/
                    A.AgregarContacto(nom,ape,tel);
                break;
                
                case 2:
                    teclado.nextLine(); // Por problema entre nextIn y nextLine
                    System.out.println(A.mostrarAgenda());
                break;
                
                case 3:
                    teclado.nextLine(); // Por problema entre nextIn y nextLine
                    System.out.println("Ingrese teléfono");
                    tel = teclado.nextLine();
                    
                    System.out.println("El contacto es:");
                    
                    System.out.println(A.Devolver(A.ObtenerPosicion(tel)).getNombre());
                    System.out.println(A.Devolver(A.ObtenerPosicion(tel)).getApellido());
                    System.out.println(A.Devolver(A.ObtenerPosicion(tel)).getTelefono());
                    
                    /*Aqui se muestra como cada método va dentro de otro. Es siempore muy importante tener en cuanta que un método es lo que devuelve. 
                    En este caso, el metodo DEVOLVER pasa a ser el objeto contacto, y por eso puedo usar sus métodos*/
                    
                break;
                
            }            
            
            
        }while(op != 0);
        
    }
    
}
