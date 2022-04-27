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
public class Worker {
    private int id;
    private String nama;
    private int tunjanganPulsa;
    private int gajiPokok;
    private int absensiHari;

    public Worker(int id, String nama, int tunjanganPulsa, int gajiPokok, int absensiHari) {
        this.id = id;
        this.nama = nama;
        this.tunjanganPulsa = tunjanganPulsa;
        this.gajiPokok = gajiPokok;
        this.absensiHari = absensiHari;
    }

    
    
    @Override
    public String toString(){
        return "worker: " + nama + " " + id + " " + absensiHari + " " + gajiPokok + " " + tunjanganPulsa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTunjanganPulsa() {
        return tunjanganPulsa;
    }

    public void setTunjanganPulsa(int tunjanganPulsa) {
        this.tunjanganPulsa = tunjanganPulsa;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getAbsensiHari() {
        return absensiHari;
    }

    public void setAbsensiHari(int absensiHari) {
        this.absensiHari = absensiHari;
    }
    
    
    
}
