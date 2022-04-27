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
public class SubClass extends SuperClass{
    int num = 10;
    
    @Override
    public void display(){
        System.out.println("Display method from subclass");
    }
    
    public void myMethod(){
        this.display();
        display();
        
        super.display();
        
        System.out.println("Num from sub class: " + num);
        System.out.println("Num from super class: " + super.num);
        
    }
    
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.myMethod();
    }
}
