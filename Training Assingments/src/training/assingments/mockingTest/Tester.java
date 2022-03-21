/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.assingments.mockingTest;

import org.junit.Test;
import org.mockito.Mockito;

public class Tester {
    @Test
    public void add(){
        StudentsDb helper=Mockito.mock(StudentsDb.class);
        Students c=new Students(helper);
        //c.getSum(0, 0);
    }
}
