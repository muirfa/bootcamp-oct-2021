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
public class IfElseDemoRefactor {
    public char evaluateGrade (int score){
        if (score >= 90){
            return 'A';
        }  else if (score >= 80){
            return 'B';
        } else if (score >= 70){
            return 'C';
        } else if (score >= 60){
            return 'D';
        } 
        return 'E';
    }
}
