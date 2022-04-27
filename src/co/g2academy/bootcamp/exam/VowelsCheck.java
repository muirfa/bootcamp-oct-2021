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
public class VowelsCheck {

    public boolean checkVowel(String text) {
        
        int length = text.length();
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                return true;
            }
        }

        return false;
    }
}
