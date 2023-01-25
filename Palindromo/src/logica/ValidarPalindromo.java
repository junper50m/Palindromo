/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Jp
 */
public class ValidarPalindromo {
    
    public ValidarPalindromo(){
    
    }
    
    public boolean Palindromo(String palabra){
        boolean retorno = false;
        
        String aux = palabra;
        
        aux = aux.toLowerCase();
        aux = aux.replace(" ", "");
        aux = aux.replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
        
        String auxinv = new StringBuilder(aux).reverse().toString();
        
        if(aux.equals(auxinv)){
            retorno = true;
        }
        
        return retorno;
    }
    
}
