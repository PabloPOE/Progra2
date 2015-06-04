/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Semana1y2.Bisiesto;
import Semana1y2.NumeroPrimo;
import Semana1y2.Palindromo;
import Semana1y2.Ejercicio5Practica1;

/**
 *
 * @author laboratorio
 */
public class Tests {
    
    public Tests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    
      @Test
    public void Palindromo (){
    int numero = 113311;
    boolean resultadoEsperado = true;
    boolean palin ;
    Palindromo Np = new Palindromo();
    palin = Np.palindromo(numero);
    String error = "Error en la prueba. se esperaba " + resultadoEsperado+ " y se obtuvo "+ palin;
    assertEquals(error, resultadoEsperado, palin);
    
    }
    
     @Test
    public void PruebaSumatoriaSoloMultiplosDe3y5 (){
    int numero = 9;
    int resultadoEsperado = 23;
    int res = 0;
    Ejercicio5Practica1 Np = new Ejercicio5Practica1();
    res = Np.SumatoriaNumMultiplos3y5(numero);
    String error = "Error en la prueba. se esperaba " + resultadoEsperado+ " y se obtuvo "+ res;
    assertEquals(error, resultadoEsperado, res);
    
    }
    
}
