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
import Chapter6.MiMatematica;
/**
 *
 * @author laboratorio
 */
public class TestMiMatematica {
    
    public TestMiMatematica() {
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
public void Testarreglos()
{

    double [] arregloNumeros = {20, 40, -5, -10, 0};
    double expectedResult = 20;
    double realresult = 0.0;
    
    //declaro instancia de clase a testear
    MiMatematica clase = new MiMatematica();
    
    //invoco al metodo que voy a testear
    realresult = clase.Maximo(arregloNumeros);
    
    assertEquals(expectedResult, realresult, 0.01);
    
    
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
