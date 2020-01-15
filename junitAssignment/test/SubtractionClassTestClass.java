/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;
import junitassignment.SubtractionClass;
/**
 *
 * @author tayea
 */
public class SubtractionClassTestClass {
    
    public SubtractionClassTestClass() {
    }
   SubtractionClass sc;
    @Before
    public void setUp() {
        sc = new SubtractionClass();
    }
    @Test
    public void TestsubitionClassMethod1()
    {
        assertEquals("succesful",0,sc.sub(5,5));
        assertEquals("succesful",4,sc.sub(8,4));
        assertEquals("succesful",-3,sc.sub(3,6));
        assertEquals("succesful",-18,sc.sub(2,20));
    }
    @Test
    public void TestsubitionClassMethod2()
    {
        assertEquals("succesful",0.00,sc.sub(5,5.00),0.00);
        assertEquals("succesful",4.00,sc.sub(8,4.00),0.00);
        assertEquals("succesful",-4.02,sc.sub(2,6.02),0.00);
        assertEquals("succesful",-18.1,sc.sub(2,20.1),0.00);
        
    }
    @Test
    public void TestsubitionClassMethod3()
    {
        assertEquals("succesful",6.02,sc.sub(7.02,1.0),0.00);
        assertEquals("succesful",4.001,sc.sub(8.003,4.002),0.000);
        assertEquals("succesful",-2.18,sc.sub(3.90,6.08),0.00);
        assertEquals("succesful",0.00,sc.sub(2.10,2.10),0.00);
    }
    @After
    public void tearDown() {
        sc=null;
    }
    
}
