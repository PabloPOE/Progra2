/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1y2;

/**
 *
 * @author Pablo
 */
public class Ejercicio5Practica1 {
    
     public static int SumatoriaNumMultiplos3y5(int Numero){
        int respuesta = 0;
        int contador = Numero;
    while(contador > 0){
    while(contador % 3 == 0 || contador % 5 == 0){
    respuesta = respuesta + contador;
    contador--;
    }
    contador--;
    }
    
    return respuesta;
}
    
}
