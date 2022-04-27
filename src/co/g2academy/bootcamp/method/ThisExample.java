/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.method;

/**
 *
 * @author Asus
 */
public class ThisExample {
    private int age;
    public ThisExample(){
        System.out.println("This is Example program on keyword this");
    }
    public ThisExample (int age){
        this(); //keyword paling aneh, invoking constructor
        this.age = age; //membedakan mana yang instance variable dan mana yg local variable
    }
    public void greet(){
        System.out.println("Hi, Wellcome to JAVA");
    }
    public void print(){
        int age =  20; //local variable
        System.out.println("value of local variable: " + age) ;
        System.out.println("vale of instance variable: " + this.age);
        this.greet(); //invoking method
    }
    public static void main (String[] args){
        ThisExample obj = new ThisExample();
        obj.print();
        
        ThisExample obj1 = new ThisExample(30);
        obj1.print();
    }
}
