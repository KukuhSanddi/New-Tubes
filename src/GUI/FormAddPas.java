/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Asus
 */
public class FormAddPas extends javax.swing.JFrame {

    /**
     * Creates new form FormAddPas
     */
    public FormAddPas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelIDP = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelUmur = new javax.swing.JLabel();
        labelGelar = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        BtnAddPasien = new javax.swing.JButton();
        BtnCAddPasien = new javax.swing.JButton();
        ComboBoxGelar = new javax.swing.JComboBox<>();
        fieldIDP = new javax.swing.JTextField();
        SpinnerUmur = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tambah Pasien", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        labelIDP.setText("IDP");

        labelNama.setText("Nama");

        labelUmur.setText("Umur");

        labelGelar.setText("Gelar");

        BtnAddPasien.setText("Tambah");

        BtnCAddPasien.setText("Kembali");

        ComboBoxGelar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tuan", "Nyonya", "Nona" }));
        ComboBoxGelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxGelarActionPerformed(evt);
            }
        });

        SpinnerUmur.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNama)
                            .addComponent(labelUmur)
                            .addComponent(labelGelar)
                            .addComponent(labelIDP))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fieldNama)
                                .addComponent(ComboBoxGelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldIDP, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                            .addComponent(SpinnerUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnCAddPasien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAddPasien)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDP)
                    .addComponent(fieldIDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUmur)
                    .addComponent(SpinnerUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelGelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAddPasien)
                            .addComponent(BtnCAddPasien)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboBoxGelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxGelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxGelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxGelarActionPerformed
    

    public void addActionListener(ActionListener a){
        BtnAddPasien.addActionListener(a);
        BtnCAddPasien.addActionListener(a);
    }
    
    public JButton getBtnAddPasien(){
        return BtnAddPasien;
    }
    
    public JButton getBtnCAddPasien(){
        return BtnCAddPasien;
    }
    
    public String getfieldIDP(){
        return fieldIDP.getText();
        
    }
    
    public String getfieldNama(){
        return fieldIDP.getText();
        
    }
    
    public int getSpinnerUmur(){
        return (int) SpinnerUmur.getValue();
    }
    
    public int getComboBoxGelar(){
        if((String)ComboBoxGelar.getSelectedItem() == "Tuan"){
            return 1;
        }
        else if((String)ComboBoxGelar.getSelectedItem() == "Nyonya"){
            return 2;
        }
        else if((String)ComboBoxGelar.getSelectedItem() == "Nona"){
            return 3;
        }
        return 0;
    }
    
    //reset
    public void resetView(){
        fieldIDP.setText("");
        fieldNama.setText("");
        SpinnerUmur.setValue(this);
        ComboBoxGelar.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddPasien;
    private javax.swing.JButton BtnCAddPasien;
    private javax.swing.JComboBox<String> ComboBoxGelar;
    private javax.swing.JSpinner SpinnerUmur;
    private javax.swing.JTextField fieldIDP;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelGelar;
    private javax.swing.JLabel labelIDP;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelUmur;
    // End of variables declaration//GEN-END:variables
}
