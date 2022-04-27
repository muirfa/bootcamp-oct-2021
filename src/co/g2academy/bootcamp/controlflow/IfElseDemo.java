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
public class IfElseDemo {
    public static void main (String[] args){
        int testScore = 76;
        char grade;
        
        if (testScore >= 90){
            grade = 'A';
        } else if (testScore >= 80){
            grade = 'B';
        } else if (testScore >= 70){
            grade = 'C';
        } else if (testScore >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Grade: " + grade);
    }
}
