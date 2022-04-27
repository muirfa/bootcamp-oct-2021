/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.oop;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class VirtualMethodTest {
//    private Employee employee = new Employee("Irfan", "Jakarta", 1);
    private Salary salary = new Salary("Irfan", "Jakarta", 1, 80d);

//    @Test
//    public void testEmployee_mail_check() {
//        String result =  employee.mailCheck();
//        assertEquals("Mailing check to Irfan Jakarta",result);
//    }
//    
//    @Test
//    public void testEmployee_to_string() {
//        String result = employee.toString();
//        assertEquals("Irfan Jakarta 1",result);
//    }
    
    @Test
    public void testSalary_mail_check() {
        String result = salary.mailCheck();
        assertEquals("Mailing check to Irfan with salary 80.0",result);
    }
    
    @Test
    public void testSalary_compute_pay() {
        Double result = salary.computePay();
        assertEquals(1d, result, 0d);
    }
    
    
}
