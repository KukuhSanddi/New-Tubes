/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Model.Dokter;
import Model.Pasien;
import Model.PasienInap;
import Model.Ruangan;
import java.util.*;

/**
 *
 * @author Asus
 */
public class Menu {
    private List <Pasien> dPasien = new ArrayList<>();
    private List <Dokter> dDokter = new ArrayList<>();
    private List <Ruangan> dRuangan = new ArrayList<>();
    
    
    public void MenuList(){
        System.out.println("== O == Selamat Datang == O ==");
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Tambah Pasien");
        System.out.println("2. Tambah Dokter");
        System.out.println("3. Tambah Pasien Inap");
        System.out.println("4. Tambah Ruangan");
        System.out.println("5. Hapus Pasien");
        System.out.println("6. Hapus Dokter");
        System.out.println("7. Hapus Pasien Inap");
        System.out.println("8. Hapus Ruangan");
        System.out.println("9. Lihat Pasien (indeks)");
        System.out.println("Pilihan = ");
    }
    
    public void addPasMenu(){
        Scanner IDP = new Scanner(System.in);
        Scanner NmPas = new Scanner(System.in);
        Scanner UmurPas = new Scanner(System.in);
        Scanner GelarPas = new Scanner(System.in);
        System.out.println("IDP                 : "); 
        int inIDP = IDP.nextInt();
        System.out.println("Nama                : "); 
        String inNmPas = NmPas.nextLine();
        System.out.println("Umur                : "); 
        int inUmurPas = UmurPas.nextInt();
        System.out.println("Gelar               : ");
        System.out.println("1. Tuan               ");
        System.out.println("2. Nyonya             ");
        System.out.println("3. Nona               "); 
        int inGelar = GelarPas.nextInt();
        
        Pasien p = new Pasien(inIDP, inNmPas, inUmurPas, inGelar);
        dPasien.add(p);
        System.out.println("Tersimpan . . .");
    }
    
    public void addDokMenu(){
        Scanner NIP = new Scanner(System.in);
        Scanner NmDok = new Scanner(System.in);
        Scanner UmurDok = new Scanner(System.in);
        Scanner GelarDok = new Scanner(System.in);
        System.out.println("NIP                 : "); 
        int inNIP = NIP.nextInt();
        System.out.println("Nama                : "); 
        String inNmDok = NmDok.next();
        System.out.println("Umur                : "); 
        int inUmurDok = UmurDok.nextInt();
        System.out.println("Gelar               : ");
        System.out.println("1. Dokter Anak            ");
        System.out.println("2. Dokter Anestesi        ");
        System.out.println("3. Dokter Bedah           ");
        System.out.println("4. Dokter Kandungan       ");
        System.out.println("5. Dokter Penyakit Dalam  ");
        System.out.println("6. Dokter THT             "); 
        int inGelar = GelarDok.nextInt();
        
        Dokter d = new Dokter(inNIP, inNmDok, inUmurDok, inGelar);
        dDokter.add(d);
        System.out.println("Tersimpan . . .");
    }
    
//    public Pasien getPas (int id){
//        return dPasien.get(id);
//        
//    }
    
    public void MainMenu (){
        boolean keluar = false;
        do {
            MenuList();
            try {
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1 :
                        try {
                            addPasMenu();
                        } catch (Exception e) {
                            System.out.println("Error to add Pasien");
                        }
                        break;
                        
                    case 2 :
                        try {
                            addDokMenu(); 
                        } catch (Exception e){
                            System.out.println("Error to add Dokter");
                        }
                        break;
                    
                    case 9 :
                        try {
                            Scanner id = new Scanner(System.in);
                            System.out.println("Input IDP = "); int inId = id.nextInt();
                            dPasien.get(inId);
                        } catch (Exception e){
                            System.out.println("Error to show Pasien");
                        }
                       break;
                    
                    case 0 :
                        keluar = true;
                        break;
                    default :
                        System.out.println("Restart the program");
                }
                
                
                
            } catch (Exception e){
                System.out.println("There was an error!");
            }
        } while (keluar == false);
        
    }
    
    
    
    
    
    
}
