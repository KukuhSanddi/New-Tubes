/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.FormMenu;
import Model.App;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus
 */
public class ControlMenu implements ActionListener{
    private FormMenu view;
    private App model;
    
    public ControlMenu(){
        view = new FormMenu();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object click = ae.getSource();
        
        if(click.equals(view.getBtnAddDok())){
            new ControlAddDok(model);
            view.dispose();
        }
        else if(click.equals(view.getBtnAddPas())){
            new ControlAddPas(model);
            view.dispose();
        }
        else if(click.equals(view.getBtnAddPasIn())){
            
        }
        else if(click.equals(view.getBtnAddRg())){
            
        }
        else if(click.equals(view.getBtnShowDok())){
            
        }
        else if(click.equals(view.getBtnShowPas())){
            new ControlShowPas();
            view.dispose();
        }
        else if(click.equals(view.getBtnShowPasIn())){
            
        }
        else if(click.equals(view.getBtnShowRg())){
            
        }
    }
    
}
