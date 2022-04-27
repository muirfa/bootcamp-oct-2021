/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.controlflow;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class IfElseDemoRefactorTest {
    
    IfElseDemoRefactor ifElseDemoRefactor = new IfElseDemoRefactor();
    
    @Test
    public void testEvaluateGrade_test_c() {
           char gradeResult = ifElseDemoRefactor.evaluateGrade(76);
           assertEquals('C', gradeResult);
    }
    
    @Test
    public void testEvaluateGrade_test_b() {
           char gradeResult = ifElseDemoRefactor.evaluateGrade(84);
           assertEquals('B', gradeResult);
    }
    
    @Test
    public void testEvaluateGrade_test_a() {
           char gradeResult = ifElseDemoRefactor.evaluateGrade(91);
           assertEquals('A', gradeResult);
    }
    
    @Test
    public void testEvaluateGrade_test_d() {
           char gradeResult = ifElseDemoRefactor.evaluateGrade(65);
           assertEquals('D', gradeResult);
    }
    
    @Test
    public void testEvaluateGrade_test_e() {
           char gradeResult = ifElseDemoRefactor.evaluateGrade(40);
           assertEquals('E', gradeResult);
    }
    
}
