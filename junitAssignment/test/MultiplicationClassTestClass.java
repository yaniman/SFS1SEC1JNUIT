/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;
import junitassignment.MultplicationClass;
/**
 *
 * @author tayea
 */
public class MultiplicationClassTestClass {
    
    
    public MultiplicationClassTestClass() {
        
    }
   MultplicationClass mlc;
      @Before
    public void setUp() {
          mlc=new MultplicationClass();
    }
@Test
    public void TestmultitionClassMethod1()
    {
        assertEquals("succesful",25,mlc.mult(5,5));
        assertEquals("succesful",32,mlc.mult(8,4));
        assertEquals("succesful",18,mlc.mult(3,6));
        assertEquals("succesful",40,mlc.mult(2,20));
    }
    @Test
    public void TestmultitionClassMethod2()
    {
        assertEquals("succesful",25.00,mlc.mult(5,5.00),0.00);
        assertEquals("succesful",32.00,mlc.mult(8,4.00),0.00);
        assertEquals("succesful",18.06,mlc.mult(3,6.02),0.00);
        assertEquals("succesful",40.2,mlc.mult(2,20.1),0.00);
        
    }
    @Test
    public void TestmultitionClassMethod3()
    {
        assertEquals("succesful",36.12,mlc.mult(6.00,6.02),0.00);
        assertEquals("succesful",32.36,mlc.mult(8.09,4.00),0.000);
        assertEquals("succesful",26.5239,mlc.mult(3.90,6.801),0.00);
        assertEquals("succesful",4.40,mlc.mult(2.2,2.00),0.0);
    }
  
    
    @After
    public void tearDown() {
        mlc=null;
    }
}
