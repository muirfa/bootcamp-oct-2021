/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.method;

/**
 *
 * @author Asus
 */
public class Varargs {
    public int maximum (int... numbers){
        int maximum =  Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > maximum){
                maximum = numbers[i];
            }
        }
        return maximum;
    }
}
