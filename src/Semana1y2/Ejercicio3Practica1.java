/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1y2;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio3Practica1 {
    
    public static void main(String[] args) {
         String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter your name");
         nombre = entrada.nextLine();
         
         if(nombre.equals("Alice")|| nombre.equals("Bob"))
      {
      System.out.println("Hello "+nombre);
      } else
          System.out.println("Your name is is nolt on the list");
    }
    
}
