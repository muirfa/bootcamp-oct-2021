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
public abstract class Employee {
    private String name;
    private String address;
    private Integer number;
    
    public abstract double computePay();

    public Employee(String name, String address, Integer number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    
    public String mailCheck(){
        return "Mailing check to " + name + " "  + address;
    }
    
    @Override
    public String toString(){
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    
    
    
}
