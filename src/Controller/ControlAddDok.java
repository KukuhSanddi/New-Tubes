/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.FormAddDok;
import Model.App;
import Model.Dokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ControlAddDok implements ActionListener {
    private App model;
    private FormAddDok view;
    
    public ControlAddDok(App model){
        this.model = model;
        view = new FormAddDok();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnAddDok())){
            String nip = view.getfieldNIP();
            String nm = view.getName();
            int umur = view.getSpinnerUmur();
            int gelar = view.getComboBoxGelar();
            
            Dokter d = new Dokter(nip, nm, gelar, umur);
            model.addDok(d);
            
        }
        else if(source.equals(view.getBtnCAddDok())){
            new ControlMenu();
            view.dispose();
        }
    }
}
