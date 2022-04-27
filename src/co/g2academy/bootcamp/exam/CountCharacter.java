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
public class CountCharacter {

    public int countChar(char c, String text) {
        int total = 0;
        char chara;
        for (int i = 0; i < text.length(); i++) {
            chara = text.charAt(i);
            if (chara == c) {
                total++;
            }
        }
        return total;

    }
}
