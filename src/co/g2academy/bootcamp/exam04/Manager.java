/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam04;

/**
 *
 * @author Asus
 */
public class Manager extends Worker{
    private int tunjanganTransport;
    private int tunjanganEntertaint;
    private int gajiManager;
    private int jumlahEntertaint;
    
    public Manager(int id, String nama, int tunjanganPulsa, int gajiPokok, int absensiHari, int jumlahEntertaint) {
        super(id, nama, tunjanganPulsa, gajiPokok, absensiHari);
        this.jumlahEntertaint = jumlahEntertaint;
    }

    public int getTunjanganTransport() {
        tunjanganTransport =  this.getAbsensiHari() * 50000;
        return tunjanganTransport;
    }

    public void setTunjanganTransport(int tunjanganTransport) {
        this.tunjanganTransport = tunjanganTransport;
    }

    public int getJumlahEntertaint() {
        return jumlahEntertaint;
    }
    
    public void setJumlahEntertaint(int jumlahEntertaint) {
        this.jumlahEntertaint = jumlahEntertaint;
    }    

    public int getTunjanganEntertaint() {
        tunjanganEntertaint = this.jumlahEntertaint * 500000;
        return tunjanganEntertaint;
    }

    public void setTunjanganEntertaint(int tunjanganEntertaint) {
        this.tunjanganEntertaint = tunjanganEntertaint;
    }

    public int getGajiManager() {
        gajiManager = this.getGajiPokok() + this.getTunjanganPulsa() + this.getTunjanganTransport() + this.getTunjanganEntertaint();
        return gajiManager;
    }

    public void setGajiManager(int gajiManager) {
        this.gajiManager = gajiManager;
    }
    
    
    
    public String tunjanganManager(){
        return "nama " + this.getNama() + " tunjangan transport " + this.getTunjanganTransport() + " tunjangan entertaint " + this.getTunjanganEntertaint();
    }
    
    public String totalGajiManager(){
        return "nama " + this.getNama() + " total gaji " + this.getGajiManager();
    }
    
}
