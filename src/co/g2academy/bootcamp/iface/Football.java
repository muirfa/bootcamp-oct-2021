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
public interface Football {
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);       
    public void endofQuarter (int quarter);
}
