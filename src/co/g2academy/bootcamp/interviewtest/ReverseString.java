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
public class ReverseString {
    public String reverse (String text){
//        tugas kita adalah membuat kalimat itu dibaca dari huruf paling belakang
//        gunakan chartAt untuk mengambil character dari String
//        contohnya, rexus mejadi suxer
        
        int length = text.length();
        String reverse = "";
        for (int i = length-1; i >= 0; i--){
            reverse = reverse + text.charAt(i);
        } return reverse;
    }
}
