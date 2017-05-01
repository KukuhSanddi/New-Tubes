/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.FormShowPasIn;
import Model.App;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author Asus
 */
public class ControlShowPasIn extends MouseAdapter implements ActionListener{
    private App model;
    private FormShowPasIn view;
    
    public ControlShowPasIn(App model){
        model = new App();
        view = new FormShowPasIn();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnCariIDP())){
            
        }
        else if(source.equals(view.getBtnShowAll())){
            
        }
        else if(source.equals(view.getBtnRemovePasIn())){
            
        }
        else if(source.equals(view.getBtnRemoveAll())){
            
        }
        else if(source.equals(view.getBtnKembali())){
            
        }
    }
}
