/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Kukuh Sanddi, Muhammad Rifky Putra Ananda, Nisa Nurhardini
 */
public class Ruangan {
    private PasienInap daftarPasien[];
//    private int noRuang;
    private String noRuang;
    private int numOfPasienInap;

//    public Ruangan(int noRuang) {
//        this.noRuang = noRuang;
//        daftarPasien = new PasienInap[4];
//    }
//
//    public int getNoRuang() {
//        return noRuang;
//    }
//
//    public void setNoRuang(int noRuang) {
//        this.noRuang = noRuang;
//    }
    
    public Ruangan(String noRuang){
        this.noRuang = noRuang;
        daftarPasien = new PasienInap[4];
    }

    public String getNoRuang() {
        return noRuang;
    }

    public void setNoRuang(String noRuang) {
        this.noRuang = noRuang;
    }
    
    public int getNumOfPasienInap() {
        return numOfPasienInap;
    }

    public PasienInap[] getDaftarPasien() {
        return daftarPasien;
    }
  
    public void setNumOfPasienInap(int numOfPasienInap) {
        this.numOfPasienInap = numOfPasienInap;
    }
    
    
    
    public void tambahPasienInap(PasienInap pi) {
        if (numOfPasienInap < daftarPasien.length) {
            daftarPasien[numOfPasienInap] = pi;
            numOfPasienInap ++;
        }
    }
    
    

//    @Override
//    public String toString() {
//        String tmp = "";
//        String p = "";
//        String d = "";
//        String diag = "";
//        for(int j = 0; j < numOfPasienInap; j++){
//            p = p + daftarPasien[j].getPasien() + "\n";
//            d = d + daftarPasien[j].getDokter() + "\n";
//        }
//        tmp = tmp + "Ruangan "+ noRuang +"\n"+
//                "Daftar Pasien : \n" + p +
//                "Dokter : \n" + d;
//               "Diagnosa 1 "+ daftarPasien[0].;
//        return tmp;
//        return "Ruangan{" + "daftarPasien=" + daftarPasien[0].getPasien() + " max=" + max + ", noRuang=" + noRuang + ", numOfPasienInap=" + numOfPasienInap + '}';
//    }

    @Override
    public String toString() {
        String a = "";
        for (int i = 0; i < numOfPasienInap; i++) {
            a += this.daftarPasien[i].toString()+ "\n";
        }
        String ket = "noRuang = " + noRuang + '\n' + "daftarPasien = " 
                + a;
        return ket;
    }

    
    
    
}
