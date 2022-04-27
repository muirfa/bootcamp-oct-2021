/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.interviewtest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class ReverseStringTest {
    
    private ReverseString example = new ReverseString();

    @Test
    public void testReverse() {
        String r = "alodokter";
        String expect = "retkodola";
        String result = example.reverse(r);
        assertEquals(expect, result);
    }
    
}
