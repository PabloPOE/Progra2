/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1y2;
import Semana1y2.MUltiplo3;

/**
 *
 * @author laboratorio
 */
public class NumeroPrimo {
    
     public boolean PrimeNumber (int number){
         boolean result = true;
         int multiplo = 2;
         
         if (number% multiplo == 0)
             result = false;
         else
             //si el numero es impar. proceda con la segunda optimizacion
         {
             multiplo = 3;
             if (MUltiplo3.MultipleOfThree(number)== true)
                 result = false;
         }
             
         
         for(int i=2;i<(number/2);i++) {
             
        if(number%i==0)
            return false;
    }
    return true;
}
    
    
}
