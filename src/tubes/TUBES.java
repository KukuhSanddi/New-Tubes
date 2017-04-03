/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Kukuh Sanddi
 */
public class TUBES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dokter d1 = new Dokter (10001, "Joko");
        d1.setGelar(1);
        System.out.println(d1.toString());
        
        Pasien p1 = new Pasien (20001, "Anto");
        p1.setGelar(1);
        System.out.println(p1.toString());
        
        PasienInap pi = new PasienInap(p1, d1);
        pi.getDokter();
        pi.getPasien();
        pi.addDiagnosa("Penyakit 1");
        pi.addDiagnosa("Penyakit 2");
        pi.addDiagnosa("Penyakit 3");
        pi.addDiagnosa("Penyakit 4");
        pi.addDiagnosa("Penyakit 5");
        pi.addDiagnosa("Penyakit 6");
        
        Ruangan r = new Ruangan(101, 2);
        r.tambahPasienInap(pi);
        System.out.println(r.toString());
        
        
        
    } 
    
    
    
}
