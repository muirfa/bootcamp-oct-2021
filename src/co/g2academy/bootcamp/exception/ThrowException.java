/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exception;

/**
 *
 * @author Asus
 */
public class ThrowException {
    public boolean validate(int age){
        if(age<18){
            throw new ArithmeticException("age is not valid");
        } return true;
    }
}
