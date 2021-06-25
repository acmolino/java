/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author VERITON
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro01 = new Libro();
        
        Libro libro03 = new Libro(234);
        
        Libro libro02 = new Libro(123, "Yo Robot", "Isaac Asimov", 200);
        
        System.out.println(libro02.getTitulo());
        
        libro01.setISBN(123);
        libro01.setTitulo("Hobre del bicentenario");
        libro01.setAutor("Asimov");
        libro01.setNumeroDePaginas(300);
        
        System.out.println(libro01);
        
        if(libro01.getNumeroDePaginas() > libro02.getNumeroDePaginas()){
            System.out.println("El libro 1 tiene más paginas");
        }
        
         if(libro02.getNumeroDePaginas() > libro01.getNumeroDePaginas()){
            System.out.println("El libro 2 tiene más paginas");
        }
        
        
        
        
        
 
    }
    
}
