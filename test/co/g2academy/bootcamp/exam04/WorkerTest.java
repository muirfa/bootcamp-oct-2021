/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam04;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class WorkerTest {
    
    private Worker worker = new Worker(1, "irfan", 30_000, 10_000_000, 20);
    private Staff staff = new Staff(1, "irfan", 30_000, 10_000_000, 20);
    private Manager manager = new Manager(1, "irfan", 30_000, 10_000_000, 20, 2);

//    @Test
//    public void testToString() {
//        String result = worker.toString();
//        assertEquals("worker: irfan 1 20 10000000 30000", result);
//    }
//
//    @Test
//    public void testStaff() {
//        String result = staff.tunjanganStaff();
//        assertEquals("nama irfan tunjangan makan 400000", result);
//    }
//    
//    @Test
//    public void testStaff_total() {
//        String result = staff.totalGajiStaff();
//        assertEquals("nama irfan total gaji 10430000", result);
//    }

    @Test
    public void testManager() {
        String result =  manager.tunjanganManager();
        assertEquals("nama irfan tunjangan transport 1000000 tunjangan entertaint 1000000", result);
    }
    
//    @Test
//    public void testManager_total() {
//        String result =  manager.totalGajiManager();
//        assertEquals("nama irfan total gaji 12030000", result);
//    }
}
