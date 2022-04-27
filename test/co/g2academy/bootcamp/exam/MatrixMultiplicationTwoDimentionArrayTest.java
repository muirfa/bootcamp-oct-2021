/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class MatrixMultiplicationTwoDimentionArrayTest {
    
    public MatrixMultiplicationTwoDimentionArray matrixMultiplicationTwoDimentionArray = new MatrixMultiplicationTwoDimentionArray();

    @Test
    public void testMatrixMultiplyArray() {
        int size = 2;
        int[][] array1 = {
            {1, 2},
            {3, 4}
        };
        int[][] array2 = {
            {4, 5},
            {6, 7}
        };
        int[][] expected = {
            {4,10},
            {18,28}
        };
        int [][] result = matrixMultiplicationTwoDimentionArray.matrixMultiply(array1, array2, size);
        assertTrue(Arrays.deepEquals(expected, result));
    }
    
    @Test
    public void testMatrixMultiplyArray2() {
        int size = 2;
        int[][] array1 = {
            {1, 2},
            {3, 4}
        };
        int[][] array2 = {
            {5, 6},
            {7, 8}
        };
        int[][] expected = {
            {5,12},
            {21,32}
        };
        int [][] result = matrixMultiplicationTwoDimentionArray.matrixMultiply(array1, array2, size);
        assertTrue(Arrays.deepEquals(expected, result));
    }
    
}
