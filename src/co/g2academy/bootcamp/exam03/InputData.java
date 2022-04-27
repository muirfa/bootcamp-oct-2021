/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam03;

import co.g2academy.bootcamp.oop.Salary;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class InputData {

    public List<Salary> getSalaryInput() {
//        get input from console

        List<Salary> salaries = new ArrayList<>();

//        while name not stop
//        if name equals stop then return break and return salary
        try {
            Scanner keyboard = new Scanner(System.in);

            String name = "", address = "";
            int number = 0;
            double salary = 0d;
            while (!name.equals("stop")) {
                System.out.println("please input your data, type stop when you finish");
                System.out.println("name: ");
                name = keyboard.next();
                if (!name.equals("stop")) {
                    System.out.println("address: ");
                    address = keyboard.next();
                    System.out.println("number: ");
                    number = keyboard.nextInt();
                    System.out.println("salary: ");
                    salary = keyboard.nextDouble();
                    Salary gaji = new Salary(name, address, number, salary);
                    salaries.add(gaji);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return salaries;
    }
}
