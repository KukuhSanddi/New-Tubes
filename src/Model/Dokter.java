/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Kukuh Sanddi,Muhammad Rifky Putra Ananda, Nisa Nurhardini
 */
public class Dokter extends Orang {
//    private int nip;
    private String g;
    private String nip;
    

//    public Dokter(int nip, String nama) {
//        super(nama);
//        this.nip = nip;
//    }

//    public Dokter(int nip, String nama, int vGelar, int umur) {
//        super(nama, vGelar, umur);
//        this.setGelar(vGelar);
//        this.nip = nip;
//    }
//    
//    public int getNip() {
//        return nip;
//    }
//
//    public void setNip(int nip) {
//        this.nip = nip;
//    }

    public Dokter(String nip, String nama, int vGelar, int umur) {
        super(nama, vGelar, umur);
        this.setGelar(vGelar);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String getGelar() {
        return super.gelar;
    }

    @Override
    public void setGelar(int vGelar) {
        switch(vGelar) {
            case 1:
                gelar = "Dokter Anak";
                g = "dr. " + getNama() + ", Sp.A";
                break;
                
            case 2:
                gelar = "Dokter Anestesi";
                g = "dr. " + getNama() + ", Sp.An";
                break;
            
            case 3:
                gelar = "Dokter Bedah";
                g = "dr. " + getNama() + ", Sp.B";
                break;
                
            case 4:
                gelar = "Dokter Kandungan";
                g = "dr. " + getNama() + ", Sp.Og"; 
                break;
                
            case 5:
                gelar = "Dokter Penyakit Dalam";
                g = "dr. " + getNama() + ", Sp.PD";
                break;
                
            case 6:
                gelar = "Dokter THT";
                g = "dr. " + getNama() + ", Sp.THT";
                break;    
        }
        
    }

//    @Override
//    public String toString() {
//        return "Dokter {" + "NIP =" + nip + ", Nama = " + g + ", Umur = " + umur + '}';
//    }
    
    @Override
    public String toString() {
        String NIP   = "NIP           : " + nip;
        String nmDok = "Nama          : " + g;
        String umDok = "Umur          : " + umur;
        
        return NIP + '\n' + nmDok + '\n' + umDok + '\n';
    }
    
    
}
    