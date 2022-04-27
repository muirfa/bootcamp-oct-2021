/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam03;

import co.g2academy.bootcamp.oop.Salary;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class InputDataAndWriteToCsvFileTest {
    
    public InputDataAndWriteToCsvFile inputDataAndWriteToCsvFile = new InputDataAndWriteToCsvFile();

    @Test
    public void testWriteSalaryDataCsvFile() {
        String filePath =  "C:\\bootcampg2\\java\\student.csv";
        List<Salary> salaries = new ArrayList<>();
        
//        initiate salaries value, for example 2 salary and put in salaries

        String name1 = "irfan";
        String address1 = "jakarta";
        int number1 = 1;
        double salary1 = 50000000d;
        
        Salary gaji = new Salary(name1, address1, number1, salary1);
        salaries.add(gaji);
        
        String name2 = "achir";
        String address2 = "goa";
        int number2 = 2;
        double salary2 = 50000000d;
        
        Salary gaji1 = new Salary(name2, address2, number2, salary2);
        salaries.add(gaji1);

        inputDataAndWriteToCsvFile.writeSalaryDataCsvFile(filePath, salaries);
        
//        find a way to test whether writing csv file is success
//        also check the content of csv

        File file = new File(filePath);
        assertTrue(file.exists());
       
        List<Salary> result = salaries;
        assertEquals(salaries, result);
    }

    @Test
    public void testMain() {
    }
    
}
