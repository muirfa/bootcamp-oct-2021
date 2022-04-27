/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.array;

/**
 *
 * @author Asus
 */
public class ArrayResize {
   
        public int[] resize(int original[], int newSize){
            int[] newArray =  new int [newSize];
            int index = 0;
            for (int item : original){
                newArray [index] = original[index];
                index++;
            }
            return newArray;
        }
    
}
