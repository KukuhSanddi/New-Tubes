/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.FormAddPas;
import Model.App;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ControlAddPas implements ActionListener{
    private App model;
    private ArrayList<Pasien> listPas;
    private FormAddPas view;
    
    public ControlAddPas(App model){
        model = new App();
        view = new FormAddPas();
        view.addActionListener(this);
        view.setVisible(true);    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnAddPasien())){
            String idp = view.getfieldIDP();
            String nm = view.getfieldNama();
            int umur = view.getSpinnerUmur();
            int gelar = view.getComboBoxGelar();
            
            Pasien p = new Pasien(idp, nm, gelar, umur);
            listPas.add(p);
        }
        else if(source.equals(view.getBtnCAddPasien())){
            new ControlMenu();
            view.dispose();
        }
    }
    
}
