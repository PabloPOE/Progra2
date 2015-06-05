/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter6;

/**
 *
 * @author laboratorio
 */
public class MiMatematica {
    
    //devuelve el maximo de dos parametros double
    
   public double Maximo (double x, double y){
    
    double result = 0.0;
    if (x < y)
        result = y;
    else
        result = x;
    return result;
    
    }
    
    //devuelve el maximo de tres parametros double
    
    public double Maximo (double x, double y, double z){
    
    double result = 0.0 ; 
    result = Maximo (Maximo(x, y), z);
    return result;
   
    }
    
     //devuelve el maximo de four parametros double
    
    public double Maximo (double x, double y, double z, double w){
    
    double result = 0.0 ;
    result = Maximo(Maximo (Maximo(x, y), z), w);
    return result;
   
    }
    
    public double Maximo (double []x){
    
    double result = 0.0;
    int largo = x.length;

    while(largo > 0)
    {
    result = Maximo(x[largo - 1], result);
    largo-- ;
    } 
 
 return result;
    }
    }


