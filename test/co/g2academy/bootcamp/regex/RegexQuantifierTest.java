/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.regex;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class RegexQuantifierTest {
    
    public RegexQuantifier regexQuantifier = new RegexQuantifier();

    @Test
    public void testIsAMNOccureOnceOrNotAtAll_a() {
        String text = "a";
        boolean result = regexQuantifier.isAMNOccureOnceOrNotAtAll(text);
        assertTrue(result);
    }
    
    @Test
    public void testIsAMNOccureOnceOrNotAtAll_empity_string() {
        String text = "";
        boolean result = regexQuantifier.isAMNOccureOnceOrNotAtAll(text);
        assertTrue(result);
    }

    @Test
    public void testIsAMNOccureOnceOrMoreTime_aaaaaaaaaaaa() {
        String text = "aaaaaaaaaaaa";
        boolean result = regexQuantifier.isAMNOccureOnceOrMoreTimes(text);
        assertTrue(result);
    }
    
    @Test
    public void testIsAMNOccureOnceOrMoreTime_aaammmnnn() {
        String text = "aaammmnnn";
        boolean result = regexQuantifier.isAMNOccureOnceOrMoreTimes(text);
        assertTrue(result);
    }
    
    @Test
    public void testIsAMNOccureZeroOrMoreTimes() {
        String text = "amanamnaaman";
        boolean result = regexQuantifier.isAMNOccureZeroOrMoreTimes(text);
        assertTrue(result);
    }
    
    @Test
    public void testIsAMNOccureThreeTimes() {
        String text = "aaa";
        boolean result = regexQuantifier.isAMNOccureThreeTimes(text);
        assertTrue(result);
    }
    
    @Test
    public void testIsAMNOccureThreeTimesOrMore() {
        String text = "aaammmnnn";
        boolean result = regexQuantifier.isAMNOccureThreeTimesOrMore(text);
        assertTrue(result);
    }
    
    @Test
    public void testIsAMNOccureThreeTimesOrMAxFiveTimes() {
        String text = "aammn";
        boolean result = regexQuantifier.isAMNOccureThreeTimesOrMaxFive(text);
        assertTrue(result);
    }
}
