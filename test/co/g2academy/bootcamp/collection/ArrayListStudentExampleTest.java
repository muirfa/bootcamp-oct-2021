/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.collection;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class ArrayListStudentExampleTest {
    
    private ArrayListStudentExample example =  new ArrayListStudentExample();

    @Test
    public void testGenerateThreeStudents() {
        List<Student> result = example.generateThreeStudents();
        assertEquals(3, result.size());
    }
    
}
