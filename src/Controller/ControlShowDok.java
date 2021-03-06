/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.FormShowDok;
import Model.App;
import Model.Dokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Rifky Putra Ananda
 */
public class ControlShowDok extends MouseAdapter implements ActionListener {
    private App model;
    private FormShowDok view;
    
    public ControlShowDok(){
        model = new App();
        view = new FormShowDok();
        model = new App();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setList(getDaftarDokter());
    }
    
    private String[] getDaftarDokter(){
        String[] dNIP = new String[model.getListDok().size()];
        for (int i = 0; i < dNIP.length; i++) {
            dNIP[i] = model.getListDok().get(i).getNip();
        }
        return dNIP;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnCariNIP())){
            for(Dokter d : model.getListDok()){
                if(d.getNip().equals(view.getfieldNIP())){
                    view.setTextDokter(d.toString());
                }
            }
        }
        else if(source.equals(view.getBtnShowAll())){
            for(Dokter d : model.getListDok()){
                view.setTextDokter(d.toString());
            }
        }
        else if(source.equals(view.getBtnRemoveDok())){
            int i = view.getSelectedDok();
            model.getListDok().remove(i);
            view.resetView();
            view.setDaftarDokter(getDaftarDokter());
        }
        else if(source.equals(view.getBtnRemoveAll())){
            model.getListDok().removeAll(model.getListDok());
            view.resetView();
            view.setDaftarDokter(getDaftarDokter());
        }
        
        else if(source.equals(view.getBtnKembali())){
            JOptionPane.showConfirmDialog(view, source, "Sesi Lihat Dokter selesai", 
                    JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            new ControlMenu();
            view.dispose();
        }
    }
}
