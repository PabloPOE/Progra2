/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;
import java.util.ArrayList;
import Chapter6.ParejaDeCoordenadas;
import Chapter6.RandomNumber;
/**
 *
 * @author Usuario
 */
public class AsignaRandomToArray {
    
    public ArrayList  Asigna (String []x){
       ArrayList<ParejaDeCoordenadas> valores = new ArrayList<ParejaDeCoordenadas>();
       
       int largo = x.length;
       RandomNumber number = new RandomNumber();
       ParejaDeCoordenadas pareja = new ParejaDeCoordenadas();
       
       while(largo > 0){
       pareja.setX(x[largo -1]);
       pareja.setY(number.AleatorioEntre0y1());
       valores.add(pareja);
       largo -- ;  
       }
        return valores ;        
        
    }
    
}
