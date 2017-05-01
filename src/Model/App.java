/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class App {
    private ArrayList<Pasien> listPas;
    private ArrayList<Dokter> listDok;
    private ArrayList<Ruangan> listRuang;
    
    public App(){
        listPas = new ArrayList();
        listDok = new ArrayList();
        listRuang = new ArrayList();
    }
    
    //add per object
    
    public void addPas(Pasien p){
        listPas.add(p);
    }
    
    public void addDok(Dokter d){
        listDok.add(d);
    }
    
    public void addRuang(Ruangan r){
        listRuang.add(r);
    }
    
    //add manual
    
    public void addPas(String idp, String nama, int vGelar, int umur){
        listPas.add(new Pasien(idp, nama, vGelar, umur));
    }
    
    public void addDok(String nip, String nama, int vGelar, int umur){
        listDok.add(new Dokter(nip, nama, vGelar, umur));
    }
    
    public void addPas(String noRuang){
        listRuang.add(new Ruangan(noRuang));
    }
    
    //get
    
    public Pasien getPasien(String idp){
        for(Pasien p : listPas){
            if(p.getIdp().equals(idp)){
                return p;
            }
        }
        return null;
    }
    
    public Dokter getDokter(String nip){
        for(Dokter d : listDok){
            if(d.getNip().equals(nip)){
                return d;
            }
        }
        return null;
    }
    
    public Ruangan getRuangan(String noRuang){
        for(Ruangan r : listRuang){
            if(r.getNoRuang().equals(noRuang)){
                return r;
            }
        }
        return null;
    }

    public ArrayList<Pasien> getListPas() {
        return listPas;
    }

    public ArrayList<Dokter> getListDok() {
        return listDok;
    }

    public ArrayList<Ruangan> getListRuang() {
        return listRuang;
    }
    
    
    
    
    
    
    
    
    
    
}
