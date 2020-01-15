/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;
import junitassignment.DivisionClass;
/**
 *
 * @author tayea
 */
public class DivisionClassTestClass {
    DivisionClass dvc;
    public DivisionClassTestClass() {
       
    }

    
    @Before
    public void setUp() {
         dvc= new DivisionClass();
    }
    @Test
    public void TestdivitionClassMethod1()
    {
        assertEquals("succesful",1,dvc.div(5,5));
        assertEquals("succesful",2,dvc.div(8,4),0.0);
        assertEquals("succesful",2,dvc.div(6,3),0.00);
        assertEquals("succesful",3,dvc.div(15,5),0.0);
    }
    @Test
    public void TestdivitionClassMethod2()
    {
        assertEquals("succesful",1.00,dvc.div(5,5.00),0.00);
        assertEquals("succesful",2.00,dvc.div(8,4.00),0.00);
        assertEquals("succesful",0.6,dvc.div(3.6,6.00),0.00);
        assertEquals("succesful",2.21,dvc.div(44.2,20.00),0.00);
        
    }
    @Test
    public void TestdivitionClassMethod3()
    {
        assertEquals("succesful",1.1,dvc.div(5.50,5.00),0.00);
        assertEquals("succesful",2.110,dvc.div(8.44,4.00),0.000);
        assertEquals("succesful",0.500,dvc.div(3.00,6.00),0.00);
        assertEquals("succesful",1.10,dvc.div(2.2,2.00),0.0);
    }
    @Test(expected=ArithmeticException.class)
    public void TestForZeroDivider()
    {
        dvc.div(98,0);
    }
    
    @After
    public void tearDown() {
    }
    // TODO div test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
