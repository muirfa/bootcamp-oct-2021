/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.controlflow;

/**
 *
 * @author Asus
 */
public class ContinueDemo {
    public int numOfPs(String text){
        int countOfPs = 0;
        for (int i = 0; i  < text.length(); i++){
            if (characterIsNotP(text.charAt(i))){
                continue;
            }
            countOfPs++;
            System.out.println(countOfPs);
        }
        return countOfPs;
    }
    public boolean characterIsNotP(char c){
        return c != 'p' && c != 'P';
        
    }
}
