/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam;

import java.util.Arrays;





/**
 *
 * @author Asus
 */
public class CheckIfTwoArraySame {

    public boolean areArraySame(int array1[], int array2[]) {
        
        if (Arrays.equals(array1, array2)){
            return true;
        }
        return false;
    }
}
