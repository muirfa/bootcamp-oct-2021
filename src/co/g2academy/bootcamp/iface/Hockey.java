/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.iface;

/**
 *
 * @author Asus
 */
public interface Hockey extends Sport {
    public void homeGoalScored();
    public void visitingGoalScored();
     
     public void endofPeriod(int period);
     public void overtimePeriod(int ot);
}
