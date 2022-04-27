/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam;

/**
 *
 * @author Asus
 */
public class MatrixMultiplicationTwoDimentionArray {
    public int[][] matrixMultiply(int array1[][], int array2[][], int size){
        int i,j;
        int c[][] = new int[size][size];
        for (i=0; i<size; i++)
            for(j=0; j<size; j++)
                c[i][j] = array1[i][j] * array2[i][j];
        return c;
    
    
    }
 }