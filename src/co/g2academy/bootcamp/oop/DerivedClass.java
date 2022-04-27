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
public class DerivedClass extends BaseClass{
    int id;

    public DerivedClass(int age, int id) {
        super(age);
        this.id =id;
    }
    
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass(20, 1);
        derivedClass.showAge();
    }
}
