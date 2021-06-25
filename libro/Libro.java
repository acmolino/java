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
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    
    public Libro(){}
    
    public Libro(int ISBN){
       this.ISBN= ISBN;
    }
    
    public Libro (int ISBN, String titulo, String autor, int numeroDePaginas){  
        this.ISBN= ISBN;
        this.titulo= titulo;
        this.autor=autor;
        this.numeroDePaginas= numeroDePaginas;    
    }

    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return this.numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    
    @Override
   public String toString(){
       return this.titulo+" "+this.autor;
   
   }
    
}
