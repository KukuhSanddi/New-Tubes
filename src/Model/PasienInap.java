/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Kukuh Sanddi, Muhammad Rifky Putra Ananda
 */
public class PasienInap {
    private Pasien pasien;
    private Dokter dokter;
    private String diagnosa[];//diganti jadi array list
    private int numOfDiagnosa;
    
    public PasienInap(Pasien p, Dokter d){
        pasien = p;
        dokter = d;
        diagnosa = new String[5];
        numOfDiagnosa = 0;
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
        if(numOfDiagnosa < diagnosa.length){
            diagnosa[numOfDiagnosa] = d;
            numOfDiagnosa ++;
        }
        else {
            
        }
    }
    
    public String[] getDiagnosa(){
        return diagnosa;
    }
    
    
}
