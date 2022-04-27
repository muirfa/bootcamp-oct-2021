/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.oop;

/**
 *
 * @author Asus
 */
public class BaseClass {
    int age;

    public BaseClass(int age) {
        this.age = age;
    }
    
    public void showAge(){
        System.out.println("Age from base class : " + age);
    }
}
