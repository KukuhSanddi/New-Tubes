/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Kukuh Sanddi
 */
public class Ruangan {
    private PasienInap daftarPasien[];
    private int max;
    private int noRuang;
    private int numOfPasienInap;

    public Ruangan(int noRuang, int max) {
        this.noRuang = noRuang;
        this.max = max;
        daftarPasien = new PasienInap[max];
    }
    
    public void tambahPasienInap(PasienInap pi) {
        if (numOfPasienInap < daftarPasien.length) {
            daftarPasien[numOfPasienInap] = pi;
            numOfPasienInap ++;
        }
    }

    @Override
    public String toString() {
        String tmp = "";
        String p = "";
        String d = "";
        String diag = "";
        for(int j=0; j<numOfPasienInap; j++){
            p = p + daftarPasien[j].getPasien() + "\n";
            d = d + daftarPasien[j].getDokter() + "\n";
        }
        tmp = tmp + "Ruangan "+ noRuang +"\n"+
                "Daftar Pasien : \n"+ p +
                "Dokter : \n"+ d;
//                "Diagnosa 1 "+ daftarPasien[0].;
        return tmp;
//        return "Ruangan{" + "daftarPasien=" + daftarPasien[0].getPasien() + " max=" + max + ", noRuang=" + noRuang + ", numOfPasienInap=" + numOfPasienInap + '}';
    }
    
    
}