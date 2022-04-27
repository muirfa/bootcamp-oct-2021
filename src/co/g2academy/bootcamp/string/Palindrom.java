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
public class Palindrom {

    boolean isPalindrom(String t) {
//use method reverse you are working on previously
//COMPARE text and reverse, if the same 
//then return true
//otherwise return false

        ReverseString reverseString = new ReverseString();
        String reverse = reverseString.reverse(t);
//    System.out.println(reverse);
        return reverse.equalsIgnoreCase(t);

    }

}
