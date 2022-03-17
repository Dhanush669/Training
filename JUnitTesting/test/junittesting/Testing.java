/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junittesting;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Dhanush
 */
public class Testing {
    @Test
    public void divide(){
        Calculator c=new Calculator();
        assertEquals(4,c.div(16, 4));
    }
    
    @Test(expected=ArithmeticException.class)
    public void divWithZero(){
        Calculator c=new Calculator();
        c.div(16, 0);
    }
}
