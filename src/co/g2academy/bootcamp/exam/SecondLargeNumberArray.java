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
public class SecondLargeNumberArray {
    public Integer findSecondLarge(int array[]){
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int i : array){
            if (i > highest) {
                second = highest;
                highest = i;
            } else if (i > second){
                second = i;
            }
        }
        return second;
    }
}
