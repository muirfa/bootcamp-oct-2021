/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.jdbc;

import java.sql.Connection;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class JdbcConnectionTest {
    
    private JdbcConnection jdbc =  new JdbcConnection();

    @Test
    public void testCreateConnection() {
        Connection actual = jdbc.createConnection();
        assertNotNull(actual);
    }

    @Test
    public void testGetPersons() {
        List<Person> actual =  jdbc.getPersons();
        assertNotNull(actual);
        for(Person person : actual){
            System.out.println("id: " + person.getId());
            System.out.println("name: " + person.getName());
            System.out.println("password: " + person.getPassword());
        }
    }
    
    @Test
    public void testSave() {
        Person p = new Person();
        p.setName("irfan-test");
        p.setPassword("pwdtest");
        jdbc.save(p);
    }
    
    @Test
    public void testUpdate() {
        Person p = new Person();
        p.setName("hujan");
        p.setPassword("testupdate");
        p.setId(4);
        jdbc.save(p);
    }
    
    @Test
    public void testDelete() {
        jdbc.delete(5);
    }
    
    @Test
    public void testGetPersonById() {
        Person p = jdbc.getPersonById(1);
        assertNotNull(p);
    }
}
