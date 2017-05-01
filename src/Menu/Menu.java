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
 * @author Muhammad Rifky Putra Ananda
 */
public class Menu {
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
    
    public void RemoveMenuOpt(){
        System.out.println("");
        System.out.println("== O ============ O ==");
        System.out.println("== O == Plihan == O ==");
        System.out.println("== O ============ O ==");
        System.out.println("1.  Hapus per indeks");
        System.out.println("2.  Hapus semua");
        System.out.print("Pilihan = ");
    }
    
//    public void RemovePasMenu(){
//        boolean keluarM = false;
//        do {
//            RemoveMenuOpt();
//            try{
//                Scanner opt = new Scanner(System.in);
//                int inOpt = opt.nextInt();
//                
//                switch(inOpt){
//                    case 1:
//                        try{
//                            Scanner id = new Scanner(System.in);
//                            System.out.print("Input IDP = "); int inId = id.nextInt();
//                            for(int i = 0; i < dPasien.size(); i++){
//                                if (dPasien.get(i).getIdp() == inId){
//                                    dPasien.remove(i);
//                                }
//                            }
//                            System.out.println("Data Pasien : " + dPasien.size());
//                        } catch(Exception e){
//                            System.out.println("Error to remove a Pasien");
//                        }
//                        break;
//                    
//                    case 2:
//                        System.out.println("Data Pasien : " + dPasien.size());
//                        try{
//                            dPasien.removeAll(dPasien);
//                            System.out.println("Data Pasien : " + dPasien.size());
//                            System.out.println("Status : Terhapus" );
//                        } catch(Exception e){
//                            System.out.println("Error to remove all Pasien");
//                        }
//                        break;
//                    
//                    case 0 :
//                        keluarM = true;
//                        MainMenu();
//                        break;
//                    default :
//                        System.out.println("Restart the program");           
//                }
//            } catch (Exception e){
//                System.out.println("There was an error!");
//            } 
//        } while (keluarM == false);
//    }
    
    public void RemovePasMenu(){
        boolean keluarM = false;
        do {
            RemoveMenuOpt();
            try{
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1:
                        try{
                            Scanner id = new Scanner(System.in);
                            System.out.print("Input IDP = "); String inId = id.next();
                            for(int i = 0; i < dPasien.size(); i++){
                                if (dPasien.get(i).getIdp().equals(inId)){
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
    
    public void ShowMenuOpt(){
        System.out.println("");
        System.out.println("== O ============ O ==");
        System.out.println("== O == Plihan == O ==");
        System.out.println("== O ============ O ==");
        System.out.println("1.  Lihat per indeks");
        System.out.println("2.  Lihat semua");
        System.out.print("Pilihan = ");
    }
    
//    public void ShowPasMenu(){
//        boolean keluarM = false;
//        do {
//            ShowMenuOpt();
//            try{
//                Scanner opt = new Scanner(System.in);
//                int inOpt = opt.nextInt();
//                
//                switch(inOpt){
//                    case 1:
//                        try{
//                            Scanner id = new Scanner(System.in);
//                            System.out.print("Input IDP = "); int inId = id.nextInt();
//                            for(int i = 0; i < dPasien.size(); i++){
//                                if (dPasien.get(i).getIdp() == inId){
//                                    System.out.println(dPasien.get(i).toString());
//                                }
//                            }
//                            System.out.println("");
//                            System.out.println("Data Pasien : " + dPasien.size());
//                        } catch(Exception e){
//                            System.out.println("Error to show a Pasien");
//                        }
//                        break;
//                    
//                    case 2:
//                        try{
//                            for (int i = 0; i < dPasien.size(); i++) {
//                                System.out.println(dPasien.get(i).toString());
//                                
//                            }
//                            System.out.println("Data Pasien : " + dPasien.size());
//                        } catch(Exception e){
//                            System.out.println("Error to show all Pasien");
//                        }
//                        break;
//                    
//                    case 0 :
//                        keluarM = true;
//                        MainMenu();
//                        break;
//                    default :
//                        System.out.println("Restart the program");           
//                }
//            } catch (Exception e){
//                System.out.println("There was an error!");
//            } 
//        } while (keluarM == false);
//    }
    
    public void ShowPasMenu(){
        boolean keluarM = false;
        do {
            ShowMenuOpt();
            try{
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1:
                        try{
                            Scanner id = new Scanner(System.in);
                            System.out.print("Input IDP = "); String inId = id.next();
                            for(int i = 0; i < dPasien.size(); i++){
                                if (dPasien.get(i).getIdp().equals(inId)){
                                    System.out.println("cek");
                                    System.out.println(dPasien.get(i).toString());
                                }
                            }
                            System.out.println("");
                            System.out.println("Data Pasien : " + dPasien.size());
                        } catch(Exception e){
                            System.out.println("Error to show a Pasien");
                        }
                        break;
                    
                    case 2:
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
    
    
//    public void RemoveDokMenu(){
//        boolean keluarM = false;
//        do {
//            RemoveMenuOpt();
//            try{
//                Scanner opt = new Scanner(System.in);
//                int inOpt = opt.nextInt();
//                
//                switch(inOpt){
//                    case 1:
//                        try{
//                            Scanner id = new Scanner(System.in);
//                            System.out.print("Input NIP = "); int inId = id.nextInt();
//                            for(int i = 0; i < dDokter.size(); i++){
//                                if (dDokter.get(i).getNip() == inId){
//                                    dDokter.remove(i);
//                                }
//                            }
//                            System.out.println("Data Dokter : " + dDokter.size());
//                        } catch(Exception e){
//                            System.out.println("Error to remove a Dokter");
//                        }
//                        break;
//                    
//                    case 2:
//                        try{
//                            dDokter.removeAll(dDokter);
//                            System.out.println("Data Dokter : " + dDokter.size());
//                            System.out.println("Status : Terhapus" );
//                        } catch(Exception e){
//                            System.out.println("Error to remove all Dokter");
//                        }
//                        break;
//                    
//                    case 0 :
//                        keluarM = true;
//                        MainMenu();
//                        break;
//                    default :
//                        System.out.println("Restart the program");           
//                }
//            } catch (Exception e){
//                System.out.println("There was an error!");
//            } 
//        } while (keluarM == false);
//    }
    
    public void RemoveDokMenu(){
        boolean keluarM = false;
        do {
            RemoveMenuOpt();
            try{
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1:
                        try{
                            Scanner id = new Scanner(System.in);
                            System.out.print("Input NIP = "); String inId = id.next();
                            for(int i = 0; i < dDokter.size(); i++){
                                if (dDokter.get(i).getNip().equals(inId)){
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
    
//    
//    public void ShowDokMenu(){
//        boolean keluarM = false;
//        do {
//            ShowMenuOpt();
//            try{
//                Scanner opt = new Scanner(System.in);
//                int inOpt = opt.nextInt();
//                
//                switch(inOpt){
//                    case 1:
//                        try{
//                            Scanner id = new Scanner(System.in);
//                            System.out.print("Input NIP = "); int inId = id.nextInt();
//                            for(int i = 0; i < dDokter.size(); i++){
//                                if (dDokter.get(i).getNip() == inId)){
//                                    System.out.println(dDokter.get(i).toString());
//                                }
//                            }
//                            System.out.println("");
//                            System.out.println("Data Dokter : " + dDokter.size());
//                        } catch(Exception e){
//                            System.out.println("Error to show a Dokter");
//                        }
//                        break;
//                    
//                    case 2:
//                        try{
//                            for (int i = 0; i < dDokter.size(); i++) {
//                                System.out.println(dDokter.get(i).toString());
//                                
//                            }
//                            System.out.println("Data Dokter : " + dDokter.size());
//                        } catch(Exception e){
//                            System.out.println("Error to show all Dokter");
//                        }
//                        break;
//                    
//                    case 0 :
//                        keluarM = true;
//                        MainMenu();
//                        break;
//                    default :
//                        System.out.println("Restart the program");           
//                }
//            } catch (Exception e){
//                System.out.println("There was an error!");
//            } 
//        } while (keluarM == false);
//    }
    
    public void ShowDokMenu(){
        boolean keluarM = false;
        do {
            ShowMenuOpt();
            try{
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1:
                        try{
                            Scanner id = new Scanner(System.in);
                            System.out.print("Input NIP = "); String inId = id.next();
                            for(int i = 0; i < dDokter.size(); i++){
                                if (dDokter.get(i).getNip().equals(inId)){
                                    System.out.println(dDokter.get(i).toString());
                                }
                            }
                            System.out.println("");
                            System.out.println("Data Dokter : " + dDokter.size());
                        } catch(Exception e){
                            System.out.println("Error to show a Dokter");
                        }
                        break;
                    
                    case 2:
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
    
//    public void addPasMenu(){
//        Scanner IDP = new Scanner(System.in);
//        Scanner NmPas = new Scanner(System.in);
//        Scanner UmurPas = new Scanner(System.in);
//        Scanner GelarPas = new Scanner(System.in);
//        System.out.print("IDP                 : "); 
//        int inIDP = IDP.nextInt();
//        System.out.print("Nama                : "); 
//        String inNmPas = NmPas.nextLine();
//        System.out.print("Umur                : "); 
//        int inUmurPas = UmurPas.nextInt();
//        System.out.println("Gelar             : ");
//        System.out.println("1. Tuan               ");
//        System.out.println("2. Nyonya             ");
//        System.out.println("3. Nona               "); 
//        System.out.print("Pilihan             : ");
//        int inGelar = GelarPas.nextInt();
//
//        Pasien p = new Pasien(inIDP, inNmPas, inGelar, inUmurPas);
//        dPasien.add(p);
//        System.out.println("Status : Tersimpan");
//    }
    
    public void addPasMenu(){
        Scanner IDP = new Scanner(System.in);
        Scanner NmPas = new Scanner(System.in);
        Scanner UmurPas = new Scanner(System.in);
        Scanner GelarPas = new Scanner(System.in);
        System.out.print("IDP                 : "); 
        String inIDP = IDP.next();
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

        Pasien p = new Pasien(inIDP, inNmPas, inGelar, inUmurPas);
        dPasien.add(p);
        System.out.println("Status : Tersimpan");
    }
    
//    public void addDokMenu(){
//        Scanner NIP = new Scanner(System.in);
//        Scanner NmDok = new Scanner(System.in);
//        Scanner UmurDok = new Scanner(System.in);
//        Scanner GelarDok = new Scanner(System.in);
//        System.out.print("NIP                 : "); 
//        int inNIP = NIP.nextInt();
//        System.out.print("Nama                : "); 
//        String inNmDok = NmDok.next();
//        System.out.print("Umur                : "); 
//        int inUmurDok = UmurDok.nextInt();
//        System.out.println("Gelar             : ");
//        System.out.println("1. Dokter Anak            ");
//        System.out.println("2. Dokter Anestesi        ");
//        System.out.println("3. Dokter Bedah           ");
//        System.out.println("4. Dokter Kandungan       ");
//        System.out.println("5. Dokter Penyakit Dalam  ");
//        System.out.println("6. Dokter THT             "); 
//        System.out.print("Pilihan             : ");
//        int inGelar = GelarDok.nextInt();
//        
//        Dokter d = new Dokter(inNIP, inNmDok, inGelar, inUmurDok);
//        dDokter.add(d);
//        System.out.println("Status : Tersimpan");
//        System.out.println("");
//    }
    
    public void addDokMenu(){
        Scanner NIP = new Scanner(System.in);
        Scanner NmDok = new Scanner(System.in);
        Scanner UmurDok = new Scanner(System.in);
        Scanner GelarDok = new Scanner(System.in);
        System.out.print("NIP                 : "); 
        String inNIP = NIP.next();
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
    
//    private Pasien getPasienBasedIndex(int i){
//        for(Pasien p : dPasien){
//            if(p.getIdp() == i){
//                return p;
//            }
//        }
//        return null;
//    }
    
    private Pasien getPasienBasedIndex(String s){
        for(Pasien p : dPasien){
            if(p.getIdp().equals(s)){
                return p;
            }
        }
        return null;
    }
    
//    private Dokter getDokterBasedIndex(int i){
//        for(Dokter d : dDokter){
//            if(d.getNip() == i){
//                return d;
//            }
//        }
//        return null;
//    }
    
    private Dokter getDokterBasedIndex(String s){
        for(Dokter d : dDokter){
            if(d.getNip().equals(s)){
                return d;
            }
        }
        return null;
    }
    
    
//    public void addPasInMenu(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input No Ruang : "); int inNoR = input.nextInt();
//        for (int i = 0; i < dRuangan.size(); i++) {
//            if (dRuangan.get(i).getNoRuang() == inNoR) {
//                System.out.println(dRuangan.get(i).toString());
//                if (dRuangan.get(i).getNumOfPasienInap() < dRuangan.get(i).getDaftarPasien().length){
//                    String Ja0 = "";
//                    PasienInap pi = null;
//                    boolean cek0 = false;
//                    while ((Ja0 != "T" || Ja0 != "t") && cek0 == false){
//                        System.out.println("Inputkan PasienInap ?");
//                        System.out.print("Pilihan (Y/T) = ");
//                        Ja0 = input.next();
//                        if (Ja0.equalsIgnoreCase("Y") || Ja0.equalsIgnoreCase("y")){
//                            System.out.print("Input IDP = "); int inId = input.nextInt();
//                            for(int j = 0; j < dPasien.size(); j++){
//                                if (dPasien.get(j).getIdp() == inId){
//                                    System.out.println(dPasien.get(j).toString());
//                                }
//                            }
//                            String Ja1 = "";
//                            boolean cek1 = false;
//                            while((Ja1 != "T" || Ja1 != "t") && cek1 == false){
//                                System.out.println("Tambahkan sebagai PasienInap ?");
//                                System.out.print("Pilihan (Y/T) = ");
//                                Ja1 = input.next();
//                                if (Ja1.equalsIgnoreCase("Y") || Ja1.equalsIgnoreCase("y")){
//                                    Pasien p = getPasienBasedIndex(inId);
//
//                                    System.out.print("Input NIP = "); int inNIP = input.nextInt();
//                                    for(int k = 0; k < dDokter.size(); k++){
//                                        if (dDokter.get(k).getNip() == inNIP){
//                                            System.out.println(dDokter.get(k).toString());
//                                            String Ja2= "";
//                                            boolean cek2 = false;
//                                            while ((Ja2 != "T" || Ja2 != "t") && cek2 == false){
//                                                System.out.println("Tambahkan sebagai Dokter ?");
//                                                System.out.print("Pilihan (Y/T) = ");
//                                                Ja2 = input.next();
//                                                if(Ja2.equalsIgnoreCase("Y") || Ja2.equalsIgnoreCase("y")){
//                                                    Dokter d = getDokterBasedIndex(inNIP);
//                                                    pi = new PasienInap(p, d);
//
//                                                    String ulang = "false";
//                                                    while (ulang == "false"){
//                                                        if(ulang.equalsIgnoreCase("false")){
//                                                            System.out.println("Tambah diagnosa = ");
//                                                            String dIn = input.next();
//
//                                                            if(dIn.equalsIgnoreCase("selesai")){
//                                                                ulang = "true";
//                                                            }
//                                                            else {
//                                                                pi.addDiagnosa(dIn);
//                                                                cek2 = true;
//                                                            }
//                                                        }
//
//                                                    }
//                                                }
//                                                else if(Ja2.equalsIgnoreCase("T") || Ja2.equalsIgnoreCase("t")){
//                                                    break;
//                                                } 
//                                            }
//                                            cek1 = true;
//                                        }
//                                        else {
//                                            System.out.println("Maaf, Dokter tidak tersedia");
//                                        }
//                                    }
//                                }
//                                else if(Ja1.equalsIgnoreCase("T") || Ja1.equalsIgnoreCase("t")){
//                                    break;
//                                }  
//                            }
//                            dRuangan.get(i).tambahPasienInap(pi);
//                            cek0 = true;
//                        }
//                            else if(Ja0.equalsIgnoreCase("T") || Ja0.equalsIgnoreCase("t")){
//                                break;
//                            }
//                    }   
//                }
//                else {
//                        System.out.println("Maaf, Ruangan telah penuh");
//                    }
//            }
//            else {
//                System.out.println("Maaf, Ruangan belum tersedia");
//            }
//        }
//    }
    
    public void addPasInMenu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input No. Ruang : "); String inNoR = input.next();
        for (int i = 0; i < dRuangan.size(); i++) {
            if (dRuangan.get(i).getNoRuang().equals(inNoR)) {
                System.out.println(dRuangan.get(i).toString());
                if (dRuangan.get(i).getNumOfPasienInap() < dRuangan.get(i).getDaftarPasien().length){
                    String Ja0 = "";
                    PasienInap pi = null;
                    boolean cek0 = false;
                    while ((Ja0 != "T" || Ja0 != "t") && cek0 == false){
                        System.out.println("");
                        System.out.println("Inputkan PasienInap ?");
                        System.out.print("Pilihan (Y/T) = ");
                        Ja0 = input.next();
                        if (Ja0.equalsIgnoreCase("Y") || Ja0.equalsIgnoreCase("y")){
                            System.out.print("Input IDP = "); String inId = input.next();
                            for(int j = 0; j < dPasien.size(); j++){
                                if (dPasien.get(j).getIdp().equals(inId)){
                                    System.out.println(dPasien.get(j).toString());
                                }
                            }
                            String Ja1 = "";
                            boolean cek1 = false;
                            while((Ja1 != "T" || Ja1 != "t") && cek1 == false){
                                System.out.println("Tambahkan sebagai PasienInap ?");
                                System.out.print("Pilihan (Y/T) = ");
                                Ja1 = input.next();
                                if (Ja1.equalsIgnoreCase("Y") || Ja1.equalsIgnoreCase("y")){
                                    Pasien p = getPasienBasedIndex(inId);

                                    System.out.print("Input NIP = "); String inNIP = input.next();
                                    for(int k = 0; k < dDokter.size(); k++){
                                        if (dDokter.get(k).getNip().equals(inNIP)){
                                            System.out.println(dDokter.get(k).toString());
                                            String Ja2= "";
                                            boolean cek2 = false;
                                            while ((Ja2 != "T" || Ja2 != "t") && cek2 == false){
                                                System.out.println("Tambahkan sebagai Dokter ?");
                                                System.out.print("Pilihan (Y/T) = ");
                                                Ja2 = input.next();
                                                if(Ja2.equalsIgnoreCase("Y") || Ja2.equalsIgnoreCase("y")){
                                                    Dokter d = getDokterBasedIndex(inNIP);
                                                    pi = new PasienInap(p, d);

                                                    String ulang = "false";
                                                    while (ulang == "false"){
                                                        if(ulang.equalsIgnoreCase("false")){
                                                            System.out.println("Tambah diagnosa = ");
                                                            String dIn = input.next();

                                                            if(dIn.equalsIgnoreCase("selesai")){
                                                                ulang = "true";
                                                            }
                                                            else {
                                                                pi.addDiagnosa(dIn);
                                                                cek2 = true;
                                                            }
                                                        }

                                                    }
                                                }
                                                else if(Ja2.equalsIgnoreCase("T") || Ja2.equalsIgnoreCase("t")){
                                                    break;
                                                } 
                                            }
                                            cek1 = true;
                                        }
                                        else {
                                            System.out.println("Maaf, Dokter tidak tersedia");
                                        }
                                    }
                                }
                                else if(Ja1.equalsIgnoreCase("T") || Ja1.equalsIgnoreCase("t")){
                                    break;
                                }  
                            }
                            dRuangan.get(i).tambahPasienInap(pi);
                            cek0 = true;
                        }
                            else if(Ja0.equalsIgnoreCase("T") || Ja0.equalsIgnoreCase("t")){
                                break;
                            }
                    }   
                }
                else {
                        System.out.println("Maaf, Ruangan telah penuh");
                    }
            }
            else {
                System.out.println("Maaf, Ruangan belum tersedia");
            }
        }
    }

//    public void RemovePasInMenu(){
//        boolean keluarM = false;
//        do {
//            RemoveMenuOpt();
//            try{
//                Scanner opt = new Scanner(System.in);
//                int inOpt = opt.nextInt();
//                
//                switch(inOpt){
//                    case 1:
//                        try{
//                            Scanner id = new Scanner(System.in);
//                            System.out.println("Input No Ruang"); String inNoR = id.next();
//                            for (int i = 0; i < dRuangan.size(); i++) {
//                                if(dRuangan.get(i).getNoRuang().equals(inNoR)){
//                                    System.out.print("Input IDP = "); String inId = id.next();
//                                    for (int j = 0; j < dRuangan.get(i).getDaftarPasien().length; j++) {
//                                        if(dRuangan.get(i).getDaftarPasien()[j].getPasien().getIdp() == inId){
//                                            dRuangan.get(i).getDaftarPasien()[j] = null;
//                                        }
//                                        System.out.println("IDP tidak ditemukan");  
//                                    }
//                                }
//                                System.out.println("Ruangan tidak ditemukan"); 
//                            }
//                            System.out.println("Data Dokter : " + dDokter.size());
//                        } catch(Exception e){
//                            System.out.println("Error to remove a Dokter");
//                        }
//                        break;
//                    
//                    case 2:
//                        try{
//                            for (int i = 0; i < dRuangan.get(i).getDaftarPasien().length; i++){
//                                dRuangan.get(i).getDaftarPasien()[i] = null;
//                            }
//                            int i = 0;
//                            System.out.println("Data Dokter : " + dRuangan.get(i).getDaftarPasien().length);
//                            System.out.println("Status : Terhapus" );
//                        } catch(Exception e){
//                            System.out.println("Error to remove all Dokter");
//                        }
//                        break;
//                    
//                    case 0 :
//                        keluarM = true;
//                        MainMenu();
//                        break;
//                    default :
//                        System.out.println("Restart the program");           
//                }
//            } catch (Exception e){
//                System.out.println("There was an error!");
//            } 
//        } while (keluarM == false);
//    }
    
    public void RemovePasInMenu(){
        boolean keluarM = false;
        do {
            RemoveMenuOpt();
            try{
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1:
                        try{
                            Scanner id = new Scanner(System.in);
                            System.out.println("Input No Ruang"); String inNoR = id.next();
                            
                            System.out.println("Data Dokter : " + dDokter.size());
                        } catch(Exception e){
                            System.out.println("Error to remove a Dokter");
                        }
                        break;
                    
                    case 2:
                        try{
                            for (int i = 0; i < dRuangan.get(i).getDaftarPasien().length; i++){
                                dRuangan.get(i).getDaftarPasien()[i] = null;
                            }
                            int i = 0;
                            System.out.println("Data Dokter : " + dRuangan.get(i).getDaftarPasien().length);
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
    
    public void ShowPasInMenu(){
        boolean keluarM = false;
        do {
            ShowMenuOpt();
            try{
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1:
                        try{
                            Scanner id = new Scanner(System.in);
                            System.out.print("Input NIP = "); String inId = id.next();
                            for(int i = 0; i < dDokter.size(); i++){
                                if (dDokter.get(i).getNip().equals(inId)){
                                    System.out.println(dDokter.get(i).toString());
                                }
                            }
                            System.out.println("");
                            System.out.println("Data Dokter : " + dDokter.size());
                        } catch(Exception e){
                            System.out.println("Error to show a Dokter");
                        }
                        break;
                    
                    case 2:
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
    
    
//    public void AddRuanganMenu(){
//        Scanner noR = new Scanner(System.in);
//        System.out.print("No. Ruang       : ");
//        int inNoR = noR.nextInt();
//        Ruangan r = new Ruangan(inNoR);
//        dRuangan.add(r);
//        
//        System.out.println("Status : Tersimpan");
//        System.out.println("");
//        
//    }
    
    public void AddRuanganMenu(){
        Scanner noR = new Scanner(System.in);
        System.out.print("No. Ruang       : ");
        String inNoR = noR.next();
        Ruangan r = new Ruangan(inNoR);
        dRuangan.add(r);
        
        System.out.println("Status : Tersimpan");
        System.out.println("");
        
    }
    
//    public void RemoveRuanganMenu(){
//        boolean keluarM = false;
//        do {
//            RemoveMenuOpt();
//            try{
//                Scanner opt = new Scanner(System.in);
//                int inOpt = opt.nextInt();
//                
//                switch(inOpt){
//                    case 1:
//                        try{
//                            Scanner NoR = new Scanner(System.in);
//                            System.out.print("Input No. Ruang = "); int inNoR = NoR.nextInt();
//                            for(int i = 0; i < dRuangan.size(); i++){
//                                if (dRuangan.get(i).getNoRuang()== inNoR){
//                                    dRuangan.remove(i);
//                                }
//                            }
//                            System.out.println("Data Ruangan : " + dRuangan.size());
//                        } catch(Exception e){
//                            System.out.println("Error to remove a Ruangan");
//                        }
//                        break;
//                    
//                    case 2:
//                        try{
//                            dRuangan.removeAll(dRuangan);
//                            System.out.println("Data Ruangan : " + dRuangan.size());
//                            System.out.println("Status : Terhapus" );
//                        } catch(Exception e){
//                            System.out.println("Error to remove all Ruangan");
//                        }
//                        break;
//                    
//                    case 0 :
//                        keluarM = true;
//                        MainMenu();
//                        break;
//                    default :
//                        System.out.println("Restart the program");           
//                }
//            } catch (Exception e){
//                System.out.println("There was an error!");
//            } 
//        } while (keluarM == false);
//    }
    
    public void RemoveRuanganMenu(){
        boolean keluarM = false;
        do {
            RemoveMenuOpt();
            try{
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1:
                        try{
                            Scanner NoR = new Scanner(System.in);
                            System.out.print("Input No. Ruang = "); String inNoR = NoR.next();
                            for(int i = 0; i < dRuangan.size(); i++){
                                if (dRuangan.get(i).getNoRuang().equals(inNoR)){
                                    dRuangan.remove(i);
                                }
                            }
                            System.out.println("Data Ruangan : " + dRuangan.size());
                        } catch(Exception e){
                            System.out.println("Error to remove a Ruangan");
                        }
                        break;
                    
                    case 2:
                        try{
                            dRuangan.removeAll(dRuangan);
                            System.out.println("Data Ruangan : " + dRuangan.size());
                            System.out.println("Status : Terhapus" );
                        } catch(Exception e){
                            System.out.println("Error to remove all Ruangan");
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
    
//    public void ShowRuanganMenu(){
//        boolean keluarM = false;
//        do {
//            ShowMenuOpt();
//            try{
//                Scanner opt = new Scanner(System.in);
//                int inOpt = opt.nextInt();
//                
//                switch(inOpt){
//                    case 1:
//                        try{
//                            Scanner NoR = new Scanner(System.in);
//                            System.out.print("Input No. Ruang = "); int inNoR = NoR.nextInt();
//                            for(int i = 0; i < dRuangan.size(); i++){
//                                if (dRuangan.get(i).getNoRuang() == inNoR){
//                                    System.out.println(dRuangan.get(i).toString());
//                                }
//                            }
//                            System.out.println("Data Ruangan : " + dRuangan.size());
//                        } catch(Exception e){
//                            System.out.println("Error to show a Ruangan");
//                        }
//                        break;
//                    
//                    case 2:
//                        System.out.println("cek");
//                        try{
//                            for (int i = 0; i < dRuangan.size(); i++) {
//                                System.out.println(dRuangan.get(i).toString());
//                                
//                            }
//                            System.out.println("Data Ruangan : " + dRuangan.size());
//                        } catch(Exception e){
//                            System.out.println("Error to show all Ruangan");
//                        }
//                        break;
//                    
//                    case 0 :
//                        keluarM = true;
//                        MainMenu();
//                        break;
//                    default :
//                        System.out.println("Restart the program");           
//                }
//            } catch (Exception e){
//                System.out.println("There was an error!");
//            } 
//        } while (keluarM == false);
//    }
    
    public void ShowRuanganMenu(){
        boolean keluarM = false;
        do {
            ShowMenuOpt();
            try{
                Scanner opt = new Scanner(System.in);
                int inOpt = opt.nextInt();
                
                switch(inOpt){
                    case 1:
                        try{
                            Scanner NoR = new Scanner(System.in);
                            System.out.print("Input No. Ruang = "); String inNoR = NoR.next();
                            for(int i = 0; i < dRuangan.size(); i++){
                                if (dRuangan.get(i).getNoRuang().equals(inNoR)){
                                    System.out.println(dRuangan.get(i).toString());
                                }
                            }
                            System.out.println("Data Ruangan : " + dRuangan.size());
                        } catch(Exception e){
                            System.out.println("Error to show a Ruangan");
                        }
                        break;
                    
                    case 2:
                        System.out.println("cek");
                        try{
                            for (int i = 0; i < dRuangan.size(); i++) {
                                System.out.println(dRuangan.get(i).toString());
                                
                            }
                            System.out.println("Data Ruangan : " + dRuangan.size());
                        } catch(Exception e){
                            System.out.println("Error to show all Ruangan");
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
                        
                    case 4 :
                        try{
                            AddRuanganMenu();
                        } catch (Exception e){
                            System.out.println("Error to add Ruangan");
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
                        
                    case 7 :
                        try{
                           RemovePasInMenu(); 
                        } catch(Exception e){
                            System.out.println("Error to remove Pasien Inap");
                        }
                        break;
                        
                    case 8 :
                        try{
                           RemoveRuanganMenu(); 
                        } catch(Exception e){
                            System.out.println("Error to remove Ruangan");
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
                       
//                    case 11 :
//                        try {
//                            ShowPasInMenu();
//                        } catch (Exception e){
//                            System.out.println("Error to show Pasien Inap");
//                        }
//                       break;
                       
                    case 12 :
                        try {
                            ShowRuanganMenu();
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
