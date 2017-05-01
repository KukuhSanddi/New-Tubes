/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import GUI.FormAddRuangan;
import Model.App;
import Model.Ruangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus
 */
public class ControlAddRuangan implements ActionListener{
    private FormAddRuangan view;
    private App model;
    
    public ControlAddRuangan(){
        model = new App();
        model= new App();
        view = new FormAddRuangan();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnTambah())){
            String nor = view.getFieldNoRuang();
            Ruangan r = new Ruangan(nor);
            model.getListRuang().add(r);
        }
        else if(source.equals(view.getBtnKembali())){
            new ControlMenu();
            view.dispose();
        }
    }
}
