/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package training.assingments.mockingTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    
    @Test
    public void testGetSum() {
        int a = 10;
        int b =5;
        StudentsDb ch=Mockito.mock(StudentsDb.class);
        Students instance = new Students(ch);
        when(instance.getAvg("Dhanush")).thenReturn((float)420);
//        instance.getAvg("Dhanush");
        assertEquals((float)70,instance.getAvg("Dhanush"),0);
        
        
    }
    
}
