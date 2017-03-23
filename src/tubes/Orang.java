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
public class Orang {
    protected String nama;
    protected char jenisKelamin = 'L';
    protected int tgl;
    protected int bln;
    protected int thn;
    protected int umur;
    
    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public char getJenisKelamin(){
        return jenisKelamin;
    }
    
    public void setJenisKelamin(char jenisKelamin){
        if (jenisKelamin =='L'){
            System.out.println("Laki - laki");
        }else
            System.out.println("perempuan");
    }
    
    public String getTglLahir(){
        String s = tgl+"-"+bln+"-"+thn;
        return s;
    }
    
    public void setTglLahir(String s){
        
    }
    
    public int getUmur(){
            return umur;
    }
    
    public void setUmur(int umur){
        Date kini = new Date();
        umur = kini.getYear()-thn;
    }
}

