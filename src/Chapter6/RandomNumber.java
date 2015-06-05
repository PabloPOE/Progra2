/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;
import java.util.*;
import jdk.nashorn.internal.runtime.JSType;


public class RandomNumber {
    
    public double AleatorioEntre0y1 (){
    
 Random numerosAleatorios = new Random();
 
 double valorAleatorio = Math.random();
 
 valorAleatorio = Math.round(valorAleatorio*100.0)/100.0;
 
 return valorAleatorio;
    }
}

    

