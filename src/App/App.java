/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Model.Dokter;
import Model.Pasien;
import Model.PasienInap;
import Model.Ruangan;
import java.util.*;

/**
 *
 * @author Asus
 */
public class App {
    private List <Pasien> dPasien = new ArrayList<>();
    private List <Dokter> dDokter = new ArrayList<>();
    private List <Ruangan> dRuangan = new ArrayList<>();
    
    
    public void MenuList(){
        System.out.println("");
        System.out.println("== O ==================== O ==");
        System.out.println("== O == Selamat Datang == O ==");
        System.out.println("== O ==================== O ==");
        System.out.println("Pilihan Menu : ");
        System.out.println("1.  Tambah Pasien");
        System.out.println("2.  Tambah Dokter");
        System.out.println("3.  Tambah Pasien Inap");
        System.out.println("4.  Tambah Ruangan");
        System.out.println("5.  Hapus Pasien");
        System.out.println("6.  Hapus Dokter");
        System.out.println("7.  Hapus Pasien Inap");
        System.out.println("8.  Hapus Ruangan");
        System.out.println("9.  Lihat Pasien");
        System.out.println("10. Lihat Dokter");
        System.out.println("11. Lihat Pasien Inap");
        System.out.println("12. Lihat Ruangan");
        
        System.out.print("Pilihan = ");
    }
    
    public void RemovePasMenuOpt(){
        System.out.println("");
        System.out.println("== O ============ O ==");
        System.out.println("== O == Plihan == O ==");
        System.out.println("== O ============ O ==");
        System.out.println("1.  Hapus per indeks");
        System.out.println("2.  Hapus semua");
        System.out.print("Pilihan = ");
    }
    
    public void RemovePasMenu(){
        boolean keluarM = false;
        do {
            RemovePasMenuOpt();
            try{
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1:
                        try{
                            Scanner id = new Scanner(System.in);
                            System.out.print("Input IDP = "); int inId = id.nextInt();
                            for(int i = 0; i < dPasien.size(); i++){
                                if (dPasien.get(i).getIdp() == inId){
                                    dPasien.remove(i);
                                }
                            }
                            System.out.println("Data Pasien : " + dPasien.size());
                        } catch(Exception e){
                            System.out.println("Error to remove a Pasien");
                        }
                        break;
                    
                    case 2:
                        System.out.println("Data Pasien : " + dPasien.size());
                        try{
                            dPasien.removeAll(dPasien);
                            System.out.println("Data Pasien : " + dPasien.size());
                            System.out.println("Status : Terhapus" );
                        } catch(Exception e){
                            System.out.println("Error to remove all Pasien");
                        }
                        break;
                    
                    case 0 :
                        keluarM = true;
                        MainMenu();
                        break;
                    default :
                        System.out.println("Restart the program");           
                }
            } catch (Exception e){
                System.out.println("There was an error!");
            } 
        } while (keluarM == false);
    }
    
    public void ShowPasMenuOpt(){
        System.out.println("");
        System.out.println("== O ============ O ==");
        System.out.println("== O == Plihan == O ==");
        System.out.println("== O ============ O ==");
        System.out.println("1.  Lihat per indeks");
        System.out.println("2.  Lihat semua");
        System.out.print("Pilihan = ");
    }
    
    public void ShowPasMenu(){
        boolean keluarM = false;
        do {
            ShowPasMenuOpt();
            try{
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1:
                        try{
                            Scanner id = new Scanner(System.in);
                            System.out.print("Input IDP = "); int inId = id.nextInt();
                            for(int i = 0; i < dPasien.size(); i++){
                                if (dPasien.get(i).getIdp() == inId){
                                    System.out.println(dPasien.get(i).toString());
                                }
                            }
                            System.out.println("Data Pasien : " + dPasien.size());
                        } catch(Exception e){
                            System.out.println("Error to show a Pasien");
                        }
                        break;
                    
                    case 2:
                        System.out.println("Data Pasien : " + dPasien.size());
                        try{
                            for (int i = 0; i < dPasien.size(); i++) {
                                System.out.println(dPasien.get(i).toString());
                                
                            }
                            System.out.println("Data Pasien : " + dPasien.size());
                        } catch(Exception e){
                            System.out.println("Error to show all Pasien");
                        }
                        break;
                    
                    case 0 :
                        keluarM = true;
                        MainMenu();
                        break;
                    default :
                        System.out.println("Restart the program");           
                }
            } catch (Exception e){
                System.out.println("There was an error!");
            } 
        } while (keluarM == false);
    }
    
    public void RemoveDokMenuOpt(){
        System.out.println("");
        System.out.println("== O ============ O ==");
        System.out.println("== O == Plihan == O ==");
        System.out.println("== O ============ O ==");
        System.out.println("1.  Hapus per indeks");
        System.out.println("2.  Hapus semua");
        System.out.print("Pilihan = ");
    }
    
    public void RemoveDokMenu(){
        boolean keluarM = false;
        do {
            RemoveDokMenuOpt();
            try{
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1:
                        try{
                            Scanner id = new Scanner(System.in);
                            System.out.print("Input NIP = "); int inId = id.nextInt();
                            for(int i = 0; i < dDokter.size(); i++){
                                if (dDokter.get(i).getNip() == inId){
                                    dDokter.remove(i);
                                }
                            }
                            System.out.println("Data Dokter : " + dDokter.size());
                        } catch(Exception e){
                            System.out.println("Error to remove a Dokter");
                        }
                        break;
                    
                    case 2:
                        try{
                            dDokter.removeAll(dDokter);
                            System.out.println("Data Dokter : " + dDokter.size());
                            System.out.println("Status : Terhapus" );
                        } catch(Exception e){
                            System.out.println("Error to remove all Dokter");
                        }
                        break;
                    
                    case 0 :
                        keluarM = true;
                        MainMenu();
                        break;
                    default :
                        System.out.println("Restart the program");           
                }
            } catch (Exception e){
                System.out.println("There was an error!");
            } 
        } while (keluarM == false);
    }
    
    public void ShowDokMenuOpt(){
        System.out.println("");
        System.out.println("== O ============ O ==");
        System.out.println("== O == Plihan == O ==");
        System.out.println("== O ============ O ==");
        System.out.println("1.  Lihat per indeks");
        System.out.println("2.  Lihat semua");
        System.out.print("Pilihan = ");
    }
    
    public void ShowDokMenu(){
        boolean keluarM = false;
        do {
            ShowPasMenuOpt();
            try{
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1:
                        try{
                            Scanner id = new Scanner(System.in);
                            System.out.print("Input NIP = "); int inId = id.nextInt();
                            for(int i = 0; i < dDokter.size(); i++){
                                if (dDokter.get(i).getNip() == inId){
                                    System.out.println(dDokter.get(i).toString());
                                }
                            }
                            System.out.println("Data Pasien : " + dDokter.size());
                        } catch(Exception e){
                            System.out.println("Error to show a Dokter");
                        }
                        break;
                    
                    case 2:
                        System.out.println("Data Dokter : " + dDokter.size());
                        try{
                            for (int i = 0; i < dDokter.size(); i++) {
                                System.out.println(dDokter.get(i).toString());
                                
                            }
                            System.out.println("Data Dokter : " + dDokter.size());
                        } catch(Exception e){
                            System.out.println("Error to show all Dokter");
                        }
                        break;
                    
                    case 0 :
                        keluarM = true;
                        MainMenu();
                        break;
                    default :
                        System.out.println("Restart the program");           
                }
            } catch (Exception e){
                System.out.println("There was an error!");
            } 
        } while (keluarM == false);
    }
    
    public void addPasMenu(){
        Scanner IDP = new Scanner(System.in);
        Scanner NmPas = new Scanner(System.in);
        Scanner UmurPas = new Scanner(System.in);
        Scanner GelarPas = new Scanner(System.in);
        System.out.print("IDP                 : "); 
        int inIDP = IDP.nextInt();
        System.out.print("Nama                : "); 
        String inNmPas = NmPas.nextLine();
        System.out.print("Umur                : "); 
        int inUmurPas = UmurPas.nextInt();
        System.out.println("Gelar             : ");
        System.out.println("1. Tuan               ");
        System.out.println("2. Nyonya             ");
        System.out.println("3. Nona               "); 
        System.out.print("Pilihan             : ");
        int inGelar = GelarPas.nextInt();
        
        
//        while(kondisi != "tidak"){
//            System.out.println("Ingin tambah diagnosa? ");
//            String kondisi = "";
//            if kondisi == "ya"
//                string diagnosa
//                diagnosa.add(diagnosa)
//        }

        Pasien p = new Pasien(inIDP, inNmPas, inGelar, inUmurPas);
        dPasien.add(p);
        System.out.println("Status : Tersimpan");
    }
    
    public void addDokMenu(){
        Scanner NIP = new Scanner(System.in);
        Scanner NmDok = new Scanner(System.in);
        Scanner UmurDok = new Scanner(System.in);
        Scanner GelarDok = new Scanner(System.in);
        System.out.print("NIP                 : "); 
        int inNIP = NIP.nextInt();
        System.out.print("Nama                : "); 
        String inNmDok = NmDok.next();
        System.out.print("Umur                : "); 
        int inUmurDok = UmurDok.nextInt();
        System.out.println("Gelar             : ");
        System.out.println("1. Dokter Anak            ");
        System.out.println("2. Dokter Anestesi        ");
        System.out.println("3. Dokter Bedah           ");
        System.out.println("4. Dokter Kandungan       ");
        System.out.println("5. Dokter Penyakit Dalam  ");
        System.out.println("6. Dokter THT             "); 
        System.out.print("Pilihan             : ");
        int inGelar = GelarDok.nextInt();
        
        Dokter d = new Dokter(inNIP, inNmDok, inGelar, inUmurDok);
        dDokter.add(d);
        System.out.println("Status : Tersimpan");
        System.out.println("");
    }
    
    private Pasien getPasienBasedIndex(int i){
        for(Pasien p : dPasien){
            if(p.getIdp() == i){
                return p;
            }
        }
        return null;
    }
    
    private Dokter getDokterBasedIndex(int i){
        for(Dokter d : dDokter){
            if(d.getNip() == i){
                return d;
            }
        }
        return null;
    }
    
    
    public void addPasInMenu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input IDP = "); int inId = input.nextInt();
        for(int i = 0; i < dPasien.size(); i++){
            if (dPasien.get(i).getIdp() == inId){
                System.out.println(dPasien.get(i).toString());
            }
        }
        String Ja1 = "";
        while(Ja1 != "T" || Ja1 != "t"){
            System.out.println("Tambahkan sebagai PasienInap ?");
            System.out.print("Pilihan (Y/T) = ");
            Ja1 = input.next();
            if (Ja1.equalsIgnoreCase("Y") || Ja1.equalsIgnoreCase("y")){
                Pasien p = getPasienBasedIndex(inId);

                System.out.println("Input NIP = "); int inNIP = input.nextInt();
                for(int i = 0; i < dDokter.size(); i++){
                    if (dDokter.get(i).getNip() == inNIP){
                        System.out.println(dDokter.get(i).toString());
                        String Ja2= "";
                        while (Ja2 != "T" || Ja2 != "t"){
                            System.out.println("Tambahkan sebagai Dokter ?");
                            System.out.print("Pilihan (Y/T) = ");
                            Ja2 = input.next();
                            if(Ja2.equalsIgnoreCase("Y") || Ja2.equalsIgnoreCase("y")){
                                Dokter d = getDokterBasedIndex(inNIP);
                                PasienInap pi = new PasienInap(p, d);

                                String ulang = "false";
                                while (ulang == "false"){
                                    if(ulang.equalsIgnoreCase("false")){
                                        System.out.println("Tambah diagnosa = ");
                                        String dIn = input.next();

                                        if(dIn.equalsIgnoreCase("selesai")){
                                            ulang = "true";
                                        }
                                        System.out.println(ulang);
                                        pi.addDiagnosa(dIn);
                                    }
                                    
                                }
                                System.out.println("cek");
                            }else if(Ja2.equalsIgnoreCase("T") || Ja2.equalsIgnoreCase("t")){
                                break;
                            } 
                        }
                    }
                }
            }else if(Ja1.equalsIgnoreCase("T") || Ja1.equalsIgnoreCase("t")){
                break;
            }  
        }
        
}
//            Scanner ja1a = new Scanner(System.in);
//            System.out.println("Tambahkan sebagai dokter PasienInap ?");
//            System.out.println("Pilihan (Y/T) = ");
//            String Ja2 = ja1a.nextLine();
//            if (Ja2 == "Y" || Ja2 == "y"){
//                Scanner 
//            }
//            
//            boolean ulang = false;
//            do {
//                System.out.println("Tambah diagnosa");
//                Scanner d = new Scanner(System.in);
//                String dIn = d.nextLine();
//                
//                if(dIn != "selesai"){
//                    ulang = true;
//                }
//                
//                
//                
//                Scanner jb = new Scanner(System.in);
//                System.out.println("Apakah ingin menambahkan diagnosa ?");
//                System.out.print("Pilihan (Ya/Tidak) = "); 
//                String Jb = jb.nextLine();
//                if (Jb == "Ya" || Jb == "ya") {
//                    Scanner diag = new Scanner(System.in);
//                    System.out.println("Diagnosa = "); String Diag = diag.nextLine();
//                    PasienInap.addDiagnosa(Diag);
//                }
//                else {
//                    
//                }
//            } while (ulang == false);
//        }
//        else if(Ja == "T"){
//            
//        }
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
                        
                    case 3 :
                        try{
                            addPasInMenu();
                        } catch (Exception e){
                            System.out.println("Error to add PasienInap");
                        }
                        break;
                        
                    case 5 :
                        try{
                            RemovePasMenu();
                        } catch(Exception e){
                            System.out.println("Error to remove Pasien");
                        }
                        break;
                     
                    case 6 :
                        try{
                           RemoveDokMenu(); 
                        } catch(Exception e){
                            System.out.println("Error to remove Dokter");
                        }
                        break;
                    
                    case 9 :
                        try {
                            ShowPasMenu();
                        } catch (Exception e){
                            System.out.println("Error to show Pasien");
                        }
                       break;
                       
                    case 10 :
                        try {
                            ShowDokMenu();
                        } catch (Exception e){
                            System.out.println("Error to show Dokter");
                        }
                       break;
                    
                    case 0 :
                        System.exit(0);
                        keluar = true;
                        break;
                    default :
                        System.out.println("Restart the program");
                        break;
                }
            } catch (Exception e){
                System.out.println("There was an error!");
            }
        } while (keluar == false);
        
    }
    
    
    
    
    
    
}
