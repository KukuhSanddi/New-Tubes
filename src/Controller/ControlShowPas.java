/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.FormShowPas;
import Model.App;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ControlShowPas extends MouseAdapter implements ActionListener{
    private ArrayList<Pasien> listPas;
    private FormShowPas view;
    private App model;
    
    public ControlShowPas(){
        model = new App();
        listPas = new ArrayList();
        view = new FormShowPas();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
        view.setList(getDaftarPasien());
    }
    
    private String[] getDaftarPasien(){
        String[] dIDP = new String[listPas.size()];
        for (int i = 0; i < dIDP.length; i++) {
            dIDP[i] = listPas.get(i).getIdp();
        }
        return dIDP;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnCariIDP())){
            for(Pasien p : model.getListPas()){
                if(p.getIdp().equals(view.getfieldIDP())){
                    view.setTextPasien(p.toString());
                }
                
            }
        }
        else if(source.equals(view.getBtnShowAll())){
            for(Pasien p : model.getListPas()){
                view.setTextPasien(p.toString());
            }
        }
        else if(source.equals(view.getBtnRemovePas())){
            int i = view.getSelectedPasien();
            listPas.remove(i);
            view.resetView();
            view.setDaftarPasien(getDaftarPasien());
        }
        else if(source.equals(view.getBtnRemoveAll())){
            listPas.removeAll(listPas);
            view.resetView();
            view.setDaftarPasien(getDaftarPasien());
        }
        else if(source.equals(view.getBtnKembali())){
            JOptionPane.showConfirmDialog(view, source, "Sesi Lihat Pasien selesai", 
                    JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            
            new ControlMenu();
            view.dispose();
        }
    }
    
    @Override
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if(source.equals(view.getListPas())){
            int i = view.getSelectedPasien();
            Pasien p = listPas.get(i);
            view.setTextPasien(p.toString());
        }
    }
    
}
