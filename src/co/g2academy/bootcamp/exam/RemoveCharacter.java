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
public class RemoveCharacter {

    public String removeChar(char c, String text) {

        char[] input = text.toCharArray();
        char[] output = new char[input.length];
        int outputIndex = 0;

        for (int i = 0; i < input.length; i++) {
            char p = input[i];
            if (p != c) {
                output[outputIndex] = p;
                outputIndex++;
            }
        }

        return new String(output, 0, outputIndex);

    }
}
