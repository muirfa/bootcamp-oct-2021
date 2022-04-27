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
public class RemoveSpace {

    public String remove(String text) {
        StringBuilder output = new StringBuilder();
        char[] charArray = text.toCharArray();
        for (char c : charArray) {
            if (!Character.isWhitespace(c)) {
                output.append(c);
            }
        }
        return output.toString();
    }
}
