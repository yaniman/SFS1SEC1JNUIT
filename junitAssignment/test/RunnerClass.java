/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tayea
 */
import junit.runner.*;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;
public class RunnerClass {
    public static void main(String[] args)
    {
        Result rs=JUnitCore.runClasses(AdditionClassTestClass.class,DivisionClassTestClass.class,MultiplicationClassTestClass.class,SubtractionClassTestClass.class);
     for(Failure f:rs.getFailures())
     {
         System.out.println(f.toString());
     }
     System.out.println("succesfull");
    }
    
}
