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
public class MUltiplo3 {
    
    
    public static int SumOfDigits(int number)
    {
        int result = 0;
        int contador = number;
        
        while(contador> 0 ){
        result=(result+(contador%10));
        contador= (contador/10); 
        }
     
        return result;
    }
    
    public static boolean MultipleOfThree (int number)
    {
    boolean result = false;
        
    return result;
    }
    
}
