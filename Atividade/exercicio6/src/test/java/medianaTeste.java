/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class medianaTeste {
    
   @Test
   public void testeVetorOrdenadoImpar(){
       double[] v = {1,2,3,4,5};
       Mediana m = new Mediana();
       double res = m.getMediana(v);
       assertEquals(3, res, 0.01);
       
   }

    private void assertEquals(int i, double res, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
