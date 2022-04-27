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
public class Salary extends Employee{
    private Double salary;
    
    public Salary(String name, String address, Integer number, Double salary){
        super(name, address, number);
        this.salary = salary;
    }
    
    public void setSalary(Double newSalary){
        if(newSalary >= 0.0){
            this.salary = newSalary;
        }
    }
    
    public Double getSalary(){
        return salary;
    }
    
    @Override
    public String mailCheck(){
        return "Mailing check to " + this.getName() + " with salary " + salary;
    }
    
    public double computePay(){
        return salary / 80;
    }
}
