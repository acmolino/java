/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacioncesar;

/**
 *
 * @author A. Molino
 */
public class Encriptacion {
    //Array con 27 letras
    char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
        'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};
    
    /**
     * Metodo que proporciona las posiciones en el Array de las letras que se le pasaron
     * @param palabra
     * @return Array con posiciones de las letras del texto pasado
     */
    int[] ubicarLetras(String palabra){
        palabra = palabra.toUpperCase();//Paso a mayuscula
        int posArray = 0; //posicion en el array donde estoy guardando el numero de letra
        int[] posiciones = new int[palabra.length()];
        for(int i = 0; i<palabra.length(); i++){
            for (int j=0; j<letras.length; j++){
                if (palabra.charAt(i) == letras[j]){
                    posiciones[posArray] = j;
                    posArray++;
                } 
            }  
       }  
       return posiciones;
    } 
    
    /**
     * Metodo que realiza la rotacion de letras, generando un array que gurda 
     * posiciones de array en forma de dato
     * @param posiciones
     * @param rotacion
     * @return Array con numero de posisiones
     */
    int[] moverPosiciones(int[] posiciones, int rotacion){
        int[] nuevasPosiciones = new int[posiciones.length];
     
        for(int i = 0; i<posiciones.length; i++){
           nuevasPosiciones[i] = (28+(posiciones[i] + rotacion))%28; //27 + Para el problema de los negativos en la desencriptacion
        }
        return nuevasPosiciones;
    }
    
    /**
     * A partir de un arrayt cargado con numeros, los asina a las letras en la 
     * posicion correspondiente del Array de letras
     * @param posiciones
     * @return Palabra en texto String
     */
    String posicionesATexto(int[] posiciones){
        String palabra = "";
        for (int i = 0; i<posiciones.length; i++){
            for (int j=0; j<letras.length; j++){
                if(j  == posiciones[i]){
                    palabra = palabra+letras[j]; 
                }
            }
        }
        return palabra;
    }

    
}
