/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package training.assingments;

import org.junit.Test;
import static org.junit.Assert.*;

public class IPValidatorTest {
    
    public IPValidatorTest() {
    }

    
    @Test
    public void testValidateIpv4Address() {
        
        assertTrue(IPValidator.ValidateIpv4Address("192.168.1.10"));
        assertFalse(IPValidator.ValidateIpv4Address("192.168.1.1"));
        
    }
    
}
