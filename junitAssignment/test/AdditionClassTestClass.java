/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import junitassignment.AdditionClass;
/**
 *
 * @author tayea
 */
public class AdditionClassTestClass {
    
    public AdditionClassTestClass() {
    }
 AdditionClass ad;
    
    @Before
    public void setUp() {
        ad= new AdditionClass();
    }
    @Test
    public void TestAdditionClassMethod1()
    {
        assertEquals("succesful",10,ad.add(5,5));
        assertEquals("succesful",12,ad.add(8,4));
        assertEquals("succesful",9,ad.add(3,6));
        assertEquals("succesful",22,ad.add(2,20));
    }
    @Test
    public void TestAdditionClassMethod2()
    {
        assertEquals("succesful",10.00,ad.add(5,5.00),0.00);
        assertEquals("succesful",12.00,ad.add(8,4.00),0.00);
        assertEquals("succesful",9.02,ad.add(3,6.02),0.00);
        assertEquals("succesful",22.1,ad.add(2,20.1),0.00);
        
    }
    @Test
    public void TestAdditionClassMethod3()
    {
        assertEquals("succesful",10.01,ad.add(5.00,5.01),0.00);
        assertEquals("succesful",13.000,ad.add(8.098,4.902),0.000);
        assertEquals("succesful",9.98,ad.add(3.90,6.08),0.00);
        assertEquals("succesful",4.20,ad.add(2.2,2.00),0.0);
    }
    
    @After
    public void tearDown() {
        ad=null;
    }
   
   
}
