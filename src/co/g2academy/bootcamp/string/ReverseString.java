/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.string;

/**
 *
 * @author Asus
 */
public class ReverseString {

    public String reverse(String t) {
//        1. use String CharAt to get character in String
//        2. use for to reverse character from the end to the start
// a b c d e
// 0 1 2 3 4
        int length = t.length();
        String reverse = "";
        for (int i = length -1; i >=0; i--){
            reverse = reverse + t.charAt(i);
        }
//        System.out.println(reverse);
        return reverse;
        
    }
}
