/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.FormShowRuangan;
import Model.App;
import Model.Ruangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ControlShowRuangan extends MouseAdapter implements ActionListener{
    private FormShowRuangan view;
    private App model;
    
    public ControlShowRuangan(){
        model = new App();
        model= new App();
        view = new FormShowRuangan();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
    }
    
    private String[] getDaftarRuang(){
        String[] dNoR = new String[model.getListRuang().size()];
        for (int i = 0; i < dNoR.length; i++) {
            dNoR[] = model.getListRuang().get(i).getNoRuang();
        }
        return dNoR;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnCariNoRuang())){
            for(Ruangan r : model.getListRuang()){
                if(r.getNoRuang().equals(view.getfieldNoRuang())){
                    view.setTextRuang(r.toString());
                }
            }
        }
        else if(source.equals(view.getBtnShowAll())){
            for(Ruangan r : model.getListRuang()){
                view.setTextRuang(r.toString());
            }
        }
        else if(source.equals(view.getBtnRemoveRuang())){
            int i = view.getSelectedRuang();
            model.getListRuang().remove(i);
            view.resetView();
            view.setDaftarRuang(getDaftarRuang());
        }
        else if(source.equals(view.getBtnRemoveAll())){
            model.getListRuang().removeAll(model.getListRuang());
            view.resetView();
            view.setDaftarRuang(getDaftarRuang());
        }
        
        else if(source.equals(view.getBtnKembali())){
            JOptionPane.showConfirmDialog(view, source, "Sesi Lihat Dokter selesai", 
                    JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            new ControlMenu();
            view.dispose();
        }
    }
}
