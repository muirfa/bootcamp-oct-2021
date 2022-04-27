/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ArrayListStudentExample {
    public List<Student> generateThreeStudents(){
        List<Student> students = new ArrayList<>();
        
        Student s1 =  new Student(1, "Vijay", 19);
        Student s2 =  new Student(1, "Kumar", 17);
        Student s3 =  new Student(1, "Ravi", 18);
        
        students.add(s1);
        students.add(s2);
        students.add(s3);
        
        return students;
        
        
    }
    
}
