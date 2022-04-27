/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam03;

import co.g2academy.bootcamp.oop.Salary;
import java.util.List;

/**
 *
 * @author Asus
 */
public class InputDataAndShowDataToConsole extends InputData {

    public void showSalaryDataToConsole(List<Salary> salaries) {
        String name = "";
//    iterate salary and show to console here
        for (Salary salary : salaries) {
            System.out.println("Your data is as follow:");
            System.out.println("|---------------------------------------------------------------|");
            System.out.println("| Name\t\t| Address\t| Number\t| Salary\t|");
            System.out.println("|---------------------------------------------------------------|");

//        continue here
            System.out.println("| " + salary.getName() + "\t\t| " + salary.getAddress() + "\t\t| " + salary.getNumber() + "\t\t| " + salary.getSalary() + "\t|");
            System.out.println("|---------------------------------------------------------------|");
        }
    }

    public static void main(String[] args) {
        InputDataAndShowDataToConsole inputDataAndShowDataToConsole = new InputDataAndShowDataToConsole();
        List<Salary> salaries = inputDataAndShowDataToConsole.getSalaryInput();
        inputDataAndShowDataToConsole.showSalaryDataToConsole(salaries);

    }

}
