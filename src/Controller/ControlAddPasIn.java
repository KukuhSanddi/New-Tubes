/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.FormAddPasIn;
import Model.App;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Muhammad Rifky Putra Ananda
 */
public class ControlAddPasIn extends MouseAdapter implements ActionListener {
    private App model;
    private FormAddPasIn view;
    
    public ControlAddPasIn(App model){
        model = new App();
        view = new FormAddPasIn();
        view.addActionListener(this);
        view.addMouseListener(this);
        view.setVisible(true); 
    }
    
    private String[] getDaftarPasien(){
        String[] dIDP = new String[model.getListPas().size()];
        for (int i = 0; i < dIDP.length; i++) {
            dIDP[i] = model.getListPas().get(i).getIdp();
        }
        return dIDP;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnCekNoRuang())){
            
        }
        else if(source.equals(view.getBtnCariIDP())){
            
        }
        else if(source.equals(view.getBtnCariNIP())){
            
        }
        else if(source.equals(view.getBtnAddDiagnosa())){
            
        }
        else if(source.equals(view.getBtnRemoveDiagnosa())){
            
        }
        else if(source.equals(view.getBtnAddPasIn())){
            
        }
    }
    

}
