/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Kukuh Sanddi, Muhammad Rifky Putra Ananda, Nisa Nurhardini
 */
public abstract class Orang {
    
    public String nama;
    public int vGelar;
    public String gelar;
    public int umur;
    
//    public Orang(String nama) {
//        this.nama = nama;
//    }

    public Orang(String nama, int vGelar, int umur) {
        this.nama = nama;
        this.vGelar = vGelar;
        this.umur = umur;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract String getGelar();

    public abstract void setGelar(int vGelar);

    
    
    
    
 }

