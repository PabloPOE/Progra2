/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1y2;

/**
 *
 * @author laboratorio
 */
public class Palindromo {
    public  boolean palindromo(int number){
    boolean resultado = true;
    int comparador = number;    
    int palindromon = 0;
    int x = number;
    int counter = 0;
    
    while (x>0){
        while (counter == 0){
            palindromon = (palindromon +(x%10));
            x = (x/10);
            counter++;
        }
        palindromon = ((palindromon*10) + (x%10));
        x = (x/10);
        
    }
    if (comparador == palindromon){
    
        return  resultado;
    
    }
       
    return false;
    }
}
