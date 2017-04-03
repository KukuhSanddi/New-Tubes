/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Kukuh Sanddi, Muhammad Rifky Putra Ananda
 */
public class Pasien extends Orang {
    private int idp;
    private String g;

    public Pasien(int idp, String nama) {
        super(nama);
        this.idp = idp;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }
    
    @Override
    public String getGelar() {
        return super.gelar;
    }
    
    public void setGelar(int vGelar) {
        switch(vGelar) {
            case 1:
                gelar = "Tuan";
                g = "Tuan "+getNama();
            case 2:
                gelar = "Nyonya";
                g = "Nyonya "+getNama();
                
            case 3:
                gelar = "Nona";
                g = "Nona "+getNama();  
        }
    }

    @Override
    public String toString() {
        return "Pasien{" + "IDP =" + idp + ", Nama = " + g + '}';
    }
    
    
    
}


