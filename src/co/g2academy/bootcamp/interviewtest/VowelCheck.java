/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.interviewtest;

/**
 *
 * @author Asus
 */
public class VowelCheck {
    public boolean vowels(String text){
        int length = text.length();
        for(int i = 0; i < length; i++){
            if (text.charAt(i) == 'a' || text.charAt(i) == 'i' || text.charAt(i) == 'u' || text.charAt(i) == 'e' || text.charAt(i) == 'o') {
                return true;
            }
        } return false;
    }
}
