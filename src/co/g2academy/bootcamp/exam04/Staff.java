/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam04;

import java.util.List;

/**
 *
 * @author Asus
 */
public class Staff extends Worker{
    private int tunjanganMakan;
    private int gajiStaff;
    
    public Staff(int id, String nama, int tunjanganPulsa, int gajiPokok, int absensiHari) {
        super(id, nama, tunjanganPulsa, gajiPokok, absensiHari);
    }

    public int getTunjanganMakan() {
        tunjanganMakan = this.getAbsensiHari()*20000;
        return tunjanganMakan;
    }

    public void setTunjanganMakan(int tunjanganMakan, List<Worker> worker) {
        this.tunjanganMakan = tunjanganMakan;
        
    }

    public int getGajiStaff() {
        gajiStaff = this.getGajiPokok() + this.getTunjanganPulsa() + this.getTunjanganMakan();
        return gajiStaff;
    }

    public void setGajiStaff(int gajiStaff) {
        this.gajiStaff = gajiStaff;
    }
    
    public String tunjanganStaff(){
        return "nama " + this.getNama() + " tunjangan makan " + this.getTunjanganMakan();
    }
    
    public String totalGajiStaff(){
        return "nama " + this.getNama() + " total gaji " + this.getGajiStaff();
    }
    

    
    
    
}
