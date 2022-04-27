/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class InputData {

    List<Staff> staffs = new ArrayList<>();
    List<Manager> managers = new ArrayList();

    public void menu() {
        String menu = "";
        do {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(isr);
            System.out.println("1. addstaff");
            System.out.println("2. addmanager");
            System.out.println("3. tunjangan");
            System.out.println("4. total gaji");
            System.out.println("5. print");
            System.out.println("0. exit");
            System.out.print("menu: ");

            try {
                menu = reader.readLine();
                menuHandler(menu, reader, isr);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } while (!menu.equals("0"));

    }

    public void menuHandler(String menu, BufferedReader reader, InputStreamReader isr) throws IOException {
        if (menu.equals("1")) {
            getStaffInput(reader, isr);
        } else if (menu.equals("2")) {
            getManagerInput(reader);
        } else if (menu.equals("3")) {
            getTunjangan(reader);
        } else if (menu.equals("4")) {
            getTotal(reader);
        } else if (menu.equals("5")) {
            getPrintOutput(reader);
        }
    }

    public void getStaffInput(BufferedReader reader, InputStreamReader isr) throws IOException {
        Staff staff = new Staff(0, "", 0, 0, 0);
        System.out.print("id staff: ");
        int id = Integer.parseInt(reader.readLine());
        staff.setId(id);
        System.out.print("nama staff: ");
        String nama = reader.readLine();
        staff.setNama(nama);
        System.out.print("jumlah absensi staff: ");
        int absensiHari = Integer.parseInt(reader.readLine());
        staff.setAbsensiHari(absensiHari);
        System.out.print("gaji pokok staff: ");
        int gajiPokok = Integer.parseInt(reader.readLine());
        staff.setGajiPokok(gajiPokok);
        System.out.print("tunjangan pulsa staff: ");
        int tunjanganPulsa = Integer.parseInt(reader.readLine());
        staff.setTunjanganPulsa(tunjanganPulsa);

        staffs.add(staff);
        System.out.println("data staff telah ditambah\n");

    }

    public void getManagerInput(BufferedReader reader) throws IOException {
        Manager manager = new Manager(0, "", 0, 0, 0, 0);
        System.out.print("id manager: ");
        int id = Integer.parseInt(reader.readLine());
        manager.setId(id);
        System.out.print("nama manager: ");
        String nama = reader.readLine();
        manager.setNama(nama);
        System.out.print("jumlah absensi manager: ");
        int absensiHari = Integer.parseInt(reader.readLine());
        manager.setAbsensiHari(absensiHari);
        System.out.print("gaji pokok manager: ");
        int gajiPokok = Integer.parseInt(reader.readLine());
        manager.setGajiPokok(gajiPokok);
        System.out.print("tunjangan pulsa manager: ");
        int tunjanganPulsa = Integer.parseInt(reader.readLine());
        manager.setTunjanganPulsa(tunjanganPulsa);
        System.out.print("jumlah entertaint manager: ");
        int tunjanganEntertaint = Integer.parseInt(reader.readLine());
        manager.setJumlahEntertaint(tunjanganEntertaint);

        managers.add(manager);
        System.out.println("data manager telah ditambah\n");
    }

    public void getTunjangan(BufferedReader reader) {
        String tunjangan = "";
        System.out.println("1. tunjangan staff");
        System.out.println("2. tunjangan manager");

        System.out.print("menu: ");

        try {
            tunjangan = reader.readLine();
            tunjanganHandler(tunjangan, reader);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void tunjanganHandler(String print, BufferedReader reader) throws IOException {
        if (print.equals("1")) {
            getTunjanganStaff(reader);
        } else if (print.equals("2")) {
            getTunjanganManager(reader);
        }
    }

    public void getTunjanganStaff(BufferedReader reader) {
        String ts = "";
        System.out.println("1. tunjangan makan");
        System.out.println("2. tunjangan pulsa");
        System.out.print("menu: ");

        try {
            ts = reader.readLine();
            tunjanganStaffHandler(ts, reader);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void tunjanganStaffHandler(String print, BufferedReader reader) throws IOException {
        if (print.equals("1")) {
            getTunjanganMakanStaff(reader);
        } else if (print.equals("2")) {
            getTunjanganPulsaStaff(reader);
        }
    }
    
    public void getTunjanganMakanStaff(BufferedReader reader) throws IOException {
        for (Staff staff : staffs) {
            System.out.print("input id: ");
            int id = Integer.parseInt(reader.readLine());

            System.out.println("tunjangan makan staff: " + staff.getTunjanganMakan() + "\n");
        }
    }
    
    public void getTunjanganPulsaStaff(BufferedReader reader) throws IOException {
        for (Staff staff : staffs) {
            System.out.print("input id: ");
            int id = Integer.parseInt(reader.readLine());

            System.out.println("tunjangan pulsa staff: " + staff.getTunjanganPulsa() + "\n");
        }
    }

    public void getTunjanganManager(BufferedReader reader) {
        String tm = "";
        System.out.println("1. tunjangan transport");
        System.out.println("2. tunjangan entertaint");
        System.out.println("3. tunjangan pulsa");
        try {
            tm = reader.readLine();
            tunjanganManagerHandler(tm, reader);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void tunjanganManagerHandler(String print, BufferedReader reader) throws IOException {
        if (print.equals("1")) {
            getTunjanganTransportManager(reader);
        } else if (print.equals("2")) {
            getTunjanganEntertaintManager(reader);
        } else if (print.equals("3")){
            getTunjanganPulsaManager(reader);
        }
    }
    
    public void getTunjanganTransportManager(BufferedReader reader) throws IOException {
        for (Manager manager : managers) {
            System.out.print("input id: ");
            int id = Integer.parseInt(reader.readLine());

            System.out.println("total gaji: " + manager.getTunjanganTransport() + "\n");
        }
    }
    
    public void getTunjanganEntertaintManager(BufferedReader reader) throws IOException {
        for (Manager manager : managers) {
            System.out.print("input id: ");
            int id = Integer.parseInt(reader.readLine());

            System.out.println("total gaji: " + manager.getTunjanganEntertaint() + "\n");
        }
    }
    
    public void getTunjanganPulsaManager(BufferedReader reader) throws IOException {
        for (Manager manager : managers) {
            System.out.print("input id: ");
            int id = Integer.parseInt(reader.readLine());

            System.out.println("total gaji: " + manager.getTunjanganPulsa() + "\n");
        }
    }
    
    

    public void getTotal(BufferedReader reader) {
        String total = "";
        System.out.println("1. total gaji staff");
        System.out.println("2. total gaji manager");

        System.out.print("menu: ");

        try {
            total = reader.readLine();
            totalHandler(total, reader);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void totalHandler(String print, BufferedReader reader) throws IOException {
        if (print.equals("1")) {
            getTotalStaff(reader);
        } else if (print.equals("2")) {
            getTotalManager(reader);
        }
    }

    public void getTotalStaff(BufferedReader reader) throws IOException {
        for (Staff staff : staffs) {
            System.out.print("input id: ");
            int id = Integer.parseInt(reader.readLine());

            System.out.println("total gaji: " + staff.getGajiStaff() + "\n");
        }
    }

    public void getTotalManager(BufferedReader reader) throws IOException {
        for (Manager manager : managers) {
            System.out.print("input id: ");
            int id = Integer.parseInt(reader.readLine());

            System.out.println("total gaji: " + manager.getGajiManager() + "\n");
        }
    }

    public void getPrintOutput(BufferedReader reader) {
        String print = "";
        System.out.println("1. print staff");
        System.out.println("2. print manager");
        System.out.println("3. print total gaji");
        System.out.print("print: ");

        try {
            print = reader.readLine();
            printHandler(print, reader);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void printHandler(String print, BufferedReader reader) throws IOException {
        if (print.equals("1")) {
            getPrintStaff(reader);
        } else if (print.equals("2")) {
            getPrintManager(reader);
        } else if (print.equals("3")) {
            getPrintTotal(reader);
        }
    }

    public void getPrintStaff(BufferedReader reader) {
        System.out.println("Rincian Gaji Staff");
        System.out.println("|---------------------------------------------------------------------------------------------------------------|");
        System.out.println("|ID\t|Nama\t|Jumlah Absen\t|Gaji Pokok\t|Tunjangan Pulsa\t|Tunjaangan Makan\t|Total Gaji\t|");
        System.out.println("|---------------------------------------------------------------------------------------------------------------|");
        for (Staff staff : staffs) {
            System.out.println("|" + staff.getId() + "\t|" + staff.getNama() + "\t|" + staff.getAbsensiHari() + "\t\t|" + staff.getGajiPokok() + "\t|"
                    + staff.getTunjanganPulsa() + "\t\t\t|" + staff.getTunjanganMakan() + "\t\t\t|" + staff.getGajiStaff() + "\t|");
            System.out.println("|---------------------------------------------------------------------------------------------------------------|");
        }
        System.out.println("|---------------------------------------------------------------------------------------------------------------|\n");
    }

    public void getPrintManager(BufferedReader reader) {
        System.out.println("Rincian Gaji Manager");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|ID\t|Nama\t|Jumlah Absen\t|Jumlah Entertaint\t|Gaji Pokok\t|Tunjangan Pulsa\t|Tunjaangan Transport\t|Tunjaangan Entertaint\t|Total Gaji\t|");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        for (Manager manager : managers) {
            System.out.println("|" + manager.getId() + "\t|" + manager.getNama() + "\t|" + manager.getAbsensiHari() + "\t\t|"
                    + manager.getJumlahEntertaint() + "\t\t\t|" + manager.getGajiPokok() + "\t|" + manager.getTunjanganPulsa() + "\t\t\t|"
                    + manager.getTunjanganTransport() + "\t\t\t|" + manager.getTunjanganEntertaint() + "\t\t|" + manager.getGajiManager() + "\t|");
            System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        }
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------|\n");
    }

    public void getPrintTotal(BufferedReader reader) {
        System.out.println("Total Gaji Karyawan");
        System.out.println("|-------------------------------|");
        System.out.println("|ID\t|Nama\t|Total Gaji\t|");
        System.out.println("|-------------------------------|");
        for (Staff staff : staffs) {
            System.out.println("|" + staff.getId() + "\t|" + staff.getNama() + "\t|" + staff.getGajiStaff() + "\t|");
            System.out.println("|-------------------------------|");
        }
        for (Manager manager : managers) {
            System.out.println("|" + manager.getId() + "\t|" + manager.getNama() + "\t|" + manager.getGajiManager() + "\t|");
            System.out.println("|-------------------------------|");
        }
        System.out.println("|-------------------------------|\n");
    }

    public static void main(String[] args) {
        InputData input = new InputData();
        input.menu();
    }
}
