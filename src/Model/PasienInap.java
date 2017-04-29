/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kukuh Sanddi, Muhammad Rifky Putra Ananda
 */
public class PasienInap {
    private Pasien pasien;
    private Dokter dokter;
    private ArrayList<String> diagnosa;
    
    public PasienInap(Pasien p, Dokter d){
        pasien = p;
        dokter = d;
        diagnosa = new ArrayList();
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }
   
    public void addDiagnosa(String d){
       diagnosa.add(d);
    }
    
    public String getDiagnosa(int id){
        return diagnosa.get(id);
    }

    @Override
    public String toString() {
//        String P, D, Di, PI;
//        P = "Pasien = " + pasien;
//        D = "Dokter = "+ dokter;
//        
//        ArrayList<String> dgg = new ArrayList();
//        for (int i = 0; i < diagnosa.size(); i++){
//            diagnosa.get(i);
//            
//        }
        
        
        return "PasienInap{" + "Pasien = " + pasien + 
                               "Dokter = " + dokter +
                               "Diagnosa = " + diagnosa + '}';
    }
    
    
}
