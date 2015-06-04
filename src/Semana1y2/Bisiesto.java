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
public class Bisiesto {

  
    
    public static boolean Bisiesto (int year){
        
        boolean result = false;
        
    if((year % 4 == 0)&& ((year % 400 == 0)||(year % 100 != 0)))
            result = true;
    
    
    return (result);
      }
}
    

