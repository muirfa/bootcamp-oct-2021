/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam03;

import co.g2academy.bootcamp.oop.Salary;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

/**
 *
 * @author Asus
 */
public class InputDataAndWriteToCsvFile extends InputData{
    public void writeSalaryDataCsvFile(String filePath, List<Salary> salaries){
//        write to csv file here
        try{
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
     
            String name = "", address = "";
            int number = 0;
            double salary = 0d;
            
            Salary gaji = new Salary(name, address, number, salary);
            
            bufferedWriter.write("name, addrees, number, salary\n");
            for (Salary newSalary : salaries) {
                bufferedWriter.write(newSalary.getName() + ", " + newSalary.getAddress() + ", " + newSalary.getNumber() + ", " + newSalary.getSalary() + "\n");
                bufferedWriter.flush();
            }
            writer.close();
            bufferedWriter.close();
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        InputDataAndWriteToCsvFile inputDataAndWriteToCsvFile = new InputDataAndWriteToCsvFile();
        List<Salary> salaries = inputDataAndWriteToCsvFile.getSalaryInput();
        String filePath = "C:\\bootcampg2\\java\\student.csv";
        inputDataAndWriteToCsvFile.writeSalaryDataCsvFile(filePath, salaries);
    }
}
