package tn.esprit;

import  org.junit.Assert;
import  org.junit.Test;
public class CalculTest {
	 Calcul calcul= new Calcul();
     
     @Test 
     public void testCalculerDiv() {
    	 Assert.assertEquals(0, calcul.calculerDiv(40, 0));
    }
     
     }
