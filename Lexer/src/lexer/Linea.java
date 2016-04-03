/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer;

/**
 *
 * @author Adrian
 */
public class Linea {
    
    private int numeroLinea;
    private int cantidadApariciones;
    
    public Linea(int pNumeroLinea){
        
        numeroLinea = pNumeroLinea;
        cantidadApariciones = 0;
        incApariciones();
    
    }
    
    public void incApariciones(){
        cantidadApariciones ++;
    }
    
    public boolean verificarApariciones(){
        return cantidadApariciones == 1;
    }

    @Override
    public String toString() {
        
        if(verificarApariciones()){
            return numeroLinea + "";
        }else {
            return numeroLinea + "(" + cantidadApariciones + ")";
        }
    }
    
    public boolean compareLinea(int pNumeroLinea){
        return numeroLinea == pNumeroLinea;
    }
    
}
